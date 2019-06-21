package com.ipartek.formacion.uf2216.ejercicios.global.accesodatos;

import java.util.ArrayList;

import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class LibrosDAOColeccion implements Crudable<Libro> {
	//Data
	//Access
	//Object
	
	// Inicio patrón Singleton
	private LibrosDAOColeccion() {}
	
	private static LibrosDAOColeccion instancia; // = new LibrosDAOColeccion();
	
	public static LibrosDAOColeccion getInstance() {
		if(instancia == null) {
			instancia = new LibrosDAOColeccion();
		}
		
		return instancia;
	}
	// Fin patrón Singleton
	
	private ArrayList<Libro> libros = new ArrayList<Libro>();
	
	@Override
	public Iterable<Libro> obtenerTodos() {
		return libros;
	}

	@Override
	public Libro obtenerPorId(long id) {
		Libro l=null;
		for(int i=0; i<=libros.size()-1; i++) {
			if(id==libros.get(i).getId())
				{
					l=libros.get(i);
				}
		}
		return l;
	}

	@Override
	public void insertar(Libro libro) {
		libro.setId(libros.size()+1);
		libros.add(libro);
	}

	@Override
	public void modificar(Libro libro) {
		for(int i=0; i<=libros.size()-1; i++) {
			if(libro.getId()==libros.get(i).getId())
				{
					libros.get(i).setAutor(libro.getAutor());
					libros.get(i).setDescripcion(libro.getDescripcion());
					libros.get(i).setEdicion(libro.getEdicion());
					libros.get(i).setEditorial(libro.getEditorial());
					libros.get(i).setGenero(libro.getGenero());
					libros.get(i).setIsbn(libro.getIsbn());
					libros.get(i).setTitulo(libro.getTitulo());
					libros.get(i).setFechaImpresion(libro.getFechaImpresion());
				}
		}
		
	}

	@Override
	public void borrar(Libro libro) {
		for(int i=0; i<=libros.size()-1; i++) {
			if(libro.getId()==libros.get(i).getId())
				{
					libros.get(i).setIsborrado(true);
				}
		}
		
	}

	@Override
	public void borrar(long id) {
		for(int i=0; i<=libros.size()-1; i++) {
			if(id==libros.get(i).getId()) libros.get(i).setIsborrado(true);
		}
		
	}
	
	public int tamaño() {
		return libros.size();
	}

}
