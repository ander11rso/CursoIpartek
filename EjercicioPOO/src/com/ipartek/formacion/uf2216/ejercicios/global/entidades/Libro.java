package com.ipartek.formacion.uf2216.ejercicios.global.entidades;

import java.io.Serializable;

public class Libro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4367834438393088358L;
	//TODO: ISBN, Editorial, Autor, Descripción, Género, Edición, IsBorrado, Fecha de impresión
	private long id;
	private String titulo;
	private String isbn;
	private String editorial;
	private String autor;
	private String descripcion;
	private String genero;
	private String edicion;
	private boolean isborrado;
	private String fechaImpresion;
	
	
	public Libro(long id, String titulo, String isbn, String editorial, String autor, String descripcion, String genero,
			String edicion, boolean isborrado, String fechaImpresion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.isbn = isbn;
		this.editorial = editorial;
		this.autor = autor;
		this.descripcion = descripcion;
		this.genero = genero;
		this.edicion = edicion;
		this.isborrado = isborrado;
		this.fechaImpresion = fechaImpresion;
	}

	public Libro(long id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}
	
	public Libro() {
		
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + "]";
	}
	
	
	public String getLibro() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", isbn=" + isbn + ", editorial=" + editorial + ", autor="
				+ autor + ", descripcion=" + descripcion + ", genero=" + genero + ", edicion=" + edicion
				+ ", fechaImpresion=" + fechaImpresion + "]";
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public boolean getIsborrado() {
		return isborrado;
	}

	public void setIsborrado(boolean isborrado) {
		this.isborrado = isborrado;
	}

	public String getFechaImpresion() {
		return fechaImpresion;
	}

	public void setFechaImpresion(String fechaImpresion) {
		this.fechaImpresion = fechaImpresion;
	}

}
