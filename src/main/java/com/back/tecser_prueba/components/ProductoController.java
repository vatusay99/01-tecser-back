package com.back.tecser_prueba.components;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.back.tecser_prueba.models.ProductosModel;
import com.back.tecser_prueba.services.ProductoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

	@Autowired
	ProductoService productoService;

	@GetMapping()
	public ArrayList<ProductosModel> getAllProducts() {
		return productoService.getProducts();
	}

	@PostMapping()
	public ProductosModel crearProducto(@RequestBody ProductosModel producto) {
		return this.productoService.agregarProductoNuevo(producto);
	}

	@GetMapping(path = "/{id}")
	public Optional<ProductosModel> getByIdProduct(@PathVariable Long id) {
		return this.productoService.getByIdProduct(id);
	}

	@DeleteMapping(path = "/{id}")
	public String deleteProduct(@PathVariable Long id){
		boolean ok = this.productoService.deleteProductById(id);
		if(ok){
			return "Se elimino el producto con ID: "+ id;

		} else{
			return "Upps Algo salio mal no fue posible eliminar el producto";
		}
	}
	
	
	
	
}
