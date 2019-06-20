package com.ipartek.formacion.uf2216.pajarracos;

public class Canario extends Ave {
	private int tamaño;

	public Canario(int tamaño, String sexo, int edad) {
		super(sexo, edad);
		setTamaño(tamaño);
	}
	public Canario( String sexo, int edad) {
		super(sexo, edad);
	}
	
	public void altura() {
		int tam=getTamaño();
		if(tam>30) {
			System.out.println("Alto");
		}
		else if(tam>=15) {
			System.out.println("Mediano");
		}
		else {
			System.out.println("Pequeño");
		}
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

}
