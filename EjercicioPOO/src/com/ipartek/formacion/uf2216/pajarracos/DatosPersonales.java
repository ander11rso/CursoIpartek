package com.ipartek.formacion.uf2216.pajarracos;

public class DatosPersonales {
	private String nombreAve;
	private String nombreDueño;

	public DatosPersonales(String nombreAve, String nombreDueño) {
		setNombreAve(nombreAve);
		setNombreDueño(nombreDueño);
	}

	public String getNombreAve() {
		return nombreAve;
	}

	public void setNombreAve(String nombreAve) {
		this.nombreAve = nombreAve;
	}

	public String getNombreDueño() {
		return nombreDueño;
	}

	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}

}
