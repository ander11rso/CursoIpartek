package com.ipartek.formacion.uf2216.ejercicios.global.presentacionconsola;

import java.util.Scanner;

import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.Crudable;
import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.LibrosDAOColeccion;
import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class MantenimientoLibros {

	public static void main(String[] args) {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		
		dao.insertar(new Libro(1, "T�tulo 1"));
		dao.insertar(new Libro(2, "T�tulo 2"));
		
		for(Libro libro: dao.obtenerTodos()) {
			System.out.println(libro);
		}
		
		//TODO Men� con insertar, modificar, borrar, listar, buscar por id
		//TODO Buscar por titulo
		
		try(Scanner s = new Scanner(System.in)) {
			
			int opc = s.nextInt();
					
			while(opc!=0 || opc!=1 || opc!=2 || opc!=3 || opc!=4 || opc!=5 || opc!=6) {
				System.out.println("1. A�adir");
				System.out.println("2. Modificar");
				System.out.println("3. Borrar");
				System.out.println("4. Listado");
				System.out.println("5. Buscar por Id");
				System.out.println("6. Buscar por Titulo");
				System.out.println("0. Salir");
				
				switch(opc) {
				case 1:
					Libro l1 = new Libro();
					
					
				}
			}
			
			} catch (Exception e) {
				System.out.println("Fallo no esperado");
				return;
				}
		
		
	}

}
