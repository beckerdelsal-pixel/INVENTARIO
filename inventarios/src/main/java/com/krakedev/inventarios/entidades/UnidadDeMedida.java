package com.krakedev.inventarios.entidades;

public class UnidadDeMedida {
	private String nombre;
	private String descripcion;
	private CategoriaUDM categoriaUnidadDeMedida;
	public UnidadDeMedida() {
		super();
	}
	public UnidadDeMedida(String nombre, String descripcion, CategoriaUDM categoriaUnidadDeMedida) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoriaUnidadDeMedida = categoriaUnidadDeMedida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public CategoriaUDM getCategoriaUDM() {
		return categoriaUnidadDeMedida;
	}
	public void setCategoriaUDM(CategoriaUDM categoriaUnidadDeMedida) {
		this.categoriaUnidadDeMedida = categoriaUnidadDeMedida;
	}
	@Override
	public String toString() {
		return "UnidadDeMedida [nombre=" + nombre + ", descripcion=" + descripcion + ", categoria=" + categoriaUnidadDeMedida + "]";
	}
}
