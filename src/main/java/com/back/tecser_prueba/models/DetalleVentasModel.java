package com.back.tecser_prueba.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_ventas_productos")
public class DetalleVentasModel {

	@Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

	@ManyToOne
	@JoinColumn(name = "id_venta")
	private VentasModel venta;

	@ManyToOne
	@JoinColumn(name = "id_producto")
	private ProductosModel producto;

	private Integer cantidad;
	private Double precioUnitario;
	
}
