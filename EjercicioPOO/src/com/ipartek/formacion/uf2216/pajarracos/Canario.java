package com.ipartek.formacion.uf2216.pajarracos;

public class Canario extends Ave {
	private int tama�o;

	public Canario(int tama�o, String sexo, int edad) {
		super(sexo, edad);
		setTama�o(tama�o);
	}
	public Canario( String sexo, int edad) {
		super(sexo, edad);
	}
	
	public void altura() {
		int tam=getTama�o();
		if(tam>30) {
			System.out.println("Alto");
		}
		else if(tam>=15) {
			System.out.println("Mediano");
		}
		else {
			System.out.println("Peque�o");
		}
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

}
