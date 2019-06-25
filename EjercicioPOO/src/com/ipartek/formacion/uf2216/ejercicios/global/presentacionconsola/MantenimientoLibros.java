package com.ipartek.formacion.uf2216.ejercicios.global.presentacionconsola;

import java.util.Scanner;
import java.io.*;

import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.Crudable;
import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.LibrosDAOColeccion;
import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class MantenimientoLibros {

	private static final String RUTA_CSV = "C:\\Users\\curso\\Desktop\\test.csv";
	private static final String RUTA_DAT = "C:\\Users\\curso\\Desktop\\test.dat";
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
				System.out.println("6. Guardar");
				System.out.println("7. Cargar");
				System.out.println("8. Exportar (CSV)");
				System.out.println("9. Importar (CSV)");
				System.out.println("0. Salir");
				String o=s.nextLine();
				if(!o.equals("")) {
					opc = comprNum(o);
				}
				else {
					o=s.nextLine();	
					opc = comprNum(o);
					}
				String res="";
				
				switch(opc) {
					case 1:
						Libro l1 = new Libro();
						System.out.println("Introduce el titulo: ");
						l1.setTitulo(s.nextLine());
						System.out.println("Introduce el ISBN: ");
						l1.setIsbn(s.nextLine());
						System.out.println("Introduce la editorial: ");
						l1.setEditorial(s.nextLine());
						System.out.println("Introduce el autor: ");
						l1.setAutor(s.nextLine());
						System.out.println("Introduce la descripcion");
						l1.setDescripcion(s.nextLine());
						System.out.println("Introduce el genero");
						l1.setGenero(s.nextLine());
						System.out.println("Introduce el numero de edicion");
						l1.setEdicion(s.nextLine());
						System.out.println("Introduce la fecha de impresion (DD/MM/AAAA)");
						l1.setFechaImpresion(s.nextLine());
						dao.insertar(l1);
						break;
					case 2:
						System.out.println("Introduce el ID del libro que quieras modificar: ");
						
						long id=s.nextLong();
							l1=dao.obtenerPorId(id);
							Libro mod=new Libro();
							System.out.println(l1.getLibro());
							System.out.println("Estas seguro que quieres modificar este libro?(S/N):");
							System.out.println("(Si presionais enter no se modificara ese dato)");
							res=s.next();
							if(res.equals("S") || res.equals("s")) {
								System.out.println("Titulo: "+l1.getTitulo());
								BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
								int x=br.read();
								char c=(char)x;
								if(x!=13) 
									{
										mod.setTitulo(c+br.readLine());
									}
								else {
									mod.setTitulo(l1.getTitulo());
								}
								System.out.println("ISBN: "+l1.getIsbn());
								br = new BufferedReader(new InputStreamReader(System.in));
								x=br.read();
								c=(char)x;
								if(x!=13) {
									mod.setIsbn(c+br.readLine());
								}
								else {
									mod.setIsbn(l1.getIsbn());
								}
								System.out.println("Editorial: "+l1.getEditorial());
								br = new BufferedReader(new InputStreamReader(System.in));
								x=br.read();
								c=(char)x;
								if(x!=13)
									{
										mod.setEditorial(c+br.readLine());
									}
								else {
									mod.setEditorial(l1.getEditorial());
								}
								System.out.println("Autor: "+l1.getAutor());
								br = new BufferedReader(new InputStreamReader(System.in));
								x=br.read();
								c=(char)x;
								if(x!=13) {
									mod.setAutor(c+br.readLine());
								}
								else {
									mod.setAutor(l1.getAutor());
								}
								System.out.println("Descripcion: "+l1.getDescripcion());
								br = new BufferedReader(new InputStreamReader(System.in));
								x=br.read();
								c=(char)x;
								if(x!=13) {
									mod.setDescripcion(c+br.readLine());
								}
								else {
									mod.setDescripcion(l1.getDescripcion());
								}
								System.out.println("Genero: "+l1.getGenero());
								br = new BufferedReader(new InputStreamReader(System.in));
								x=br.read();
								c=(char)x;
								if(x!=13) {
									mod.setGenero(c+br.readLine());
								}
								else {
									mod.setGenero(l1.getGenero());
								}
								System.out.println("Edicion: "+l1.getEdicion());
								br = new BufferedReader(new InputStreamReader(System.in));
								x=br.read();
								c=(char)x;
								if(x!=32) {
									mod.setEdicion(c+br.readLine());
								}
								else {
									mod.setEdicion(l1.getEdicion());
								}
								System.out.println("Introduce la fecha de imrpesion:"+l1.getFechaImpresion());
								br = new BufferedReader(new InputStreamReader(System.in));
								x=br.read();
								c=(char)x;
								if(x!=13) {
									mod.setFechaImpresion(c+br.readLine());
								}
								else {
									mod.setFechaImpresion(l1.getFechaImpresion());
								}
								dao.modificar(mod);
								break;
							}
							break;
						
						
					case 3:
						System.out.println("Introduce el ID: ");
						String id4=s.nextLine();
						if(comprNum(id4)!= -1) {
							Libro l2=dao.obtenerPorId(Long.parseLong(id4));
							if(l2==null) {
								System.out.println("No existe un libro con esa ID");
							}
							else {
								
								System.out.println(l2.getLibro());
								System.out.println("Estas seguro que quieres borrar este libro?(S/N):");
								res=s.nextLine();
								if(res.equals("S") || res.equals("s")) {
									dao.borrar(l2.getId());
									break;
								}
								else {
									break;
								}
							}
						}
						break;
					case 4: 
						for(Libro libro: dao.obtenerTodos()) {
							if(!libro.getIsborrado()){
									System.out.println(libro);
								}
						}
						break;
					case 5:
						System.out.println("Introduce el ID: ");
						String id5=s.nextLine();
						if(comprNum(id5)!= -1) {
							Libro l2=dao.obtenerPorId(Long.parseLong(id5));
							if(l2==null) {
								System.out.println("No existe un libro con esa ID");
							}
							else {
								
								System.out.println(l2.getLibro());
							}
						}
						break;
					case 6:
						try{
							FileOutputStream fout = new FileOutputStream(RUTA_DAT);
							ObjectOutputStream oos = new ObjectOutputStream(fout);
							oos.writeObject(dao);
							oos.close();
							fout.close();
							System.out.println("done!");
						} catch (FileNotFoundException e) {
						      System.out.println(e.getMessage());
						    }
						break;
					case 7:
						try{
							FileInputStream fit = new FileInputStream(RUTA_DAT);
							ObjectInputStream ois = new ObjectInputStream(fit);
							dao= (Crudable<Libro>) ois.readObject();
							ois.close();
							fit.close();
							System.out.println("done!");
						} catch (FileNotFoundException e) {
						      System.out.println(e.getMessage());
						    }
						break;
					case 9:
						 try (PrintWriter writer = new PrintWriter(new File(RUTA_CSV))) {

						      StringBuilder sb = new StringBuilder();
						      sb.append("sep=,\n");
						      sb.append("id,titulo,isbn,editorial,autor,descripcion,genero,edicion,isBorrado,fechaImpresion\n");
						      for(Libro libro: dao.obtenerTodos()) {
						    	  sb.append(libro.getId() + "," + libro.getTitulo() + "," + libro.getIsbn() + "," + libro.getEditorial() + "," + libro.getAutor() + "," 
						    			  	+ libro.getDescripcion() + "," + libro.getGenero() + "," + libro.getEdicion() + "," + libro.getIsborrado() + "," 
						    			  	+ libro.getFechaImpresion() + "\n");
										
								}

						      writer.write(sb.toString());

						      System.out.println("done!");

						    } catch (FileNotFoundException e) {
						      System.out.println(e.getMessage());
						    }
						 break;
						
				}
				
			} while(opc!=0);
			
			} catch (Exception e) {
				System.out.println("Fallo no esperado");
				return;
				}
		
		
	}//cierra el main
	private static int comprNum(String s) {
		int num=0;
		try {
			num=Integer.parseInt(s);
		}
		catch(Exception e) {
			System.out.println("Mete un numero cazurro");
			num=-1;
		}
		return num;
	}
}//cierra la clase
