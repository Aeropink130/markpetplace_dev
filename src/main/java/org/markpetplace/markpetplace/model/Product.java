package org.markpetplace.markpetplace.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Product {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto", unique=true, nullable=false)
	private Long id_producto;
	private String nombre_producto;
	private float precio;
	private int cantidad;
	private String ciudad;
	private String estado;
	private String animal;
	private String categoria;
	private String descripcion;
	private String imagen;
	
	//Constructor vacío
	public Product() {
		
	}

	//Constructor lleno
	public Product(Long id_producto, String nombre_producto, float precio, int cantidad, String ciudad, String estado,
			String animal, String categoria, String descripcion, String imagen) {
		super();
		this.id_producto = id_producto;
		this.nombre_producto = nombre_producto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.ciudad = ciudad;
		this.estado = estado;
		this.animal = animal;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.imagen = imagen;
	}
	
	//Getters y Setters
	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	//toString
	@Override
	public String toString() {
		return "Product [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", precio=" + precio
				+ ", cantidad=" + cantidad + ", ciudad=" + ciudad + ", estado=" + estado + ", animal=" + animal
				+ ", categoria=" + categoria + ", descripcion=" + descripcion + ", imagen=" + imagen + "]";
	}
}
