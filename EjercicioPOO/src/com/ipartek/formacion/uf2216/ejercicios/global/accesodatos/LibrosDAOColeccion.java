package com.ipartek.formacion.uf2216.ejercicios.global.accesodatos;

import java.io.Serializable;
import java.util.ArrayList;

import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class LibrosDAOColeccion implements Crudable<Libro>, Serializable {
	//Data
	//Access
	//Object
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8020532392395562306L;

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
					libros.set(i,libro);
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
