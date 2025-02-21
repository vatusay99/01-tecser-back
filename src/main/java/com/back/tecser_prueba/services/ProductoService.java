package com.back.tecser_prueba.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.back.tecser_prueba.models.ProductosModel;
import com.back.tecser_prueba.repositories.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	ProductoRepository productoRepository;

	public ArrayList<ProductosModel> getProducts(){
		return (ArrayList<ProductosModel>) productoRepository.findAll();
	}

	public ProductosModel agregarProductoNuevo(ProductosModel producto){
		return productoRepository.save(producto);
	}

	public Optional<ProductosModel> getByIdProduct(Long id){
		return productoRepository.findById(id);
	}

	public boolean deleteProductById(Long id){
		try {
			productoRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
