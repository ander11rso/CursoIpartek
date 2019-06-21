package com.ipartek.formacion.uf2216.ejercicios.global.presentacionconsola;

import java.util.Scanner;

import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.Crudable;
import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.LibrosDAOColeccion;
import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class MantenimientoLibros {

	public static void main(String[] args) {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		
		dao.insertar(new Libro(1, "Título 1"));
		dao.insertar(new Libro(2, "Título 2"));
		
		for(Libro libro: dao.obtenerTodos()) {
			if(!libro.getIsborrado()) System.out.println(libro);
		}
		
		//TODO Menú con insertar, modificar, borrar, listar, buscar por id
		//TODO Buscar por titulo
		
		try(Scanner s = new Scanner(System.in)) {
			
			int opc=0;
					
			do {
				System.out.println("1. Añadir");
				System.out.println("2. Modificar");
				System.out.println("3. Borrar");
				System.out.println("4. Listado");
				System.out.println("5. Buscar por Id");
				System.out.println("0. Salir");
				opc = s.nextInt();
				
				switch(opc) {
					case 1:
						Libro l1 = new Libro();
						System.out.println("Introduce el titulo: ");
						l1.setTitulo(s.next());
						System.out.println("Introduce el ISBN: ");
						l1.setIsbn(s.next());
						System.out.println("Introduce la editorial: ");
						l1.setEditorial(s.next());
						System.out.println("Introduce el autor: ");
						l1.setAutor(s.next());
						System.out.println("Introduce la descripcion");
						l1.setDescripcion(s.next());
						System.out.println("Introduce el genero");
						l1.setGenero(s.next());
						System.out.println("Introduce el numero de edicion");
						l1.setEdicion(s.next());
						System.out.println("Introduce la fecha de impresion (DD/MM/AAAA)");
						l1.setFechaImpresion(s.next());
						dao.insertar(l1);
						break;
					case 3:
						System.out.println("Introduce el ID: ");
						long id=s.nextLong();
						System.out.println(dao.obtenerPorId(id));
						System.out.println("Estas seguro que quieres borrar este libro?(S/N):");
						if(s.next().equals("S") || s.next().equals("s")) {
							dao.borrar(id);
							break;
						}
						else {
							break;
						}
					case 5:
						System.out.println("Introduce el ID: ");					
						System.out.println(dao.obtenerPorId(s.nextLong()));
						break;
					case 4: 
						for(Libro libro: dao.obtenerTodos()) {
							if(!libro.getIsborrado()) System.out.println(libro);
						}
						break;	
				}
				
			} while(opc!=0);
			
			} catch (Exception e) {
				System.out.println("Fallo no esperado");
				return;
				}
		
		
	}

}
