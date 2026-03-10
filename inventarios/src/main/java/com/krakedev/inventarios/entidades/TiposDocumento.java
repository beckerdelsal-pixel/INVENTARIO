package com.krakedev.inventarios.entidades;

public class TiposDocumento {
	private String codigo;
	private String descricion;
	public TiposDocumento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TiposDocumento(String codigo, String descricion) {
		super();
		this.codigo = codigo;
		this.descricion = descricion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricion() {
		return descricion;
	}
	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}
	@Override
	public String toString() {
		return "TiposDocumento [codigo=" + codigo + ", descricion=" + descricion + "]";
	}
	
	
}
