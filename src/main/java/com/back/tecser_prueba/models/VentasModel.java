package com.back.tecser_prueba.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ventas")
public class VentasModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;

	@ManyToOne
  @JoinColumn(name = "id_vendedor")
  private VendedorModel vendedor;

	private Date fecha_venta;
	public enum Tipo_Pago {
		Efectivo,
		Devito,
		Credito,
		Cheque
	};

	@Enumerated(EnumType.STRING)  // Almacena el valor como una cadena (nombre del enum)
  private Tipo_Pago tipo_pago;

	private String nombre_cliente;
	private String apellido_cliente;
	private Integer id_cliente;




    // Otros atributos
	
}
