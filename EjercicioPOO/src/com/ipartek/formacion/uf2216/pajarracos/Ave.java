package com.ipartek.formacion.uf2216.pajarracos;

public class Ave {
	
	private String sexo="";
	private int edad=0;
	private static int cantidad=0;
	private DatosPersonales nombres;
	
	public Ave(String sexo, int edad){
		this.sexo=sexo;
		this.edad=edad;
		cantidad++;
	}
	
	public void numAves() {
		System.out.println(getCantidad());
	}
	
	public void quienSoy() {
		System.out.println("Sexo: "+getSexo());
		System.out.println("Edad: "+getEdad());
	}
	
	public void cantar() {
		
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	

}
