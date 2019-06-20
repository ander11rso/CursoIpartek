package com.ipartek.formacion.uf2216.pajarracos;

public class Loro extends Ave {
	private String region;
	private String color;

	public Loro(String sexo, int edad, String region, String color) {
		super(sexo, edad);
		setRegion(region);
		setColor(color);
		
	}
	
	@Override
	public void cantar() {
		System.out.println("Piiio-piiiio loro bonito");
	}
	
	
	public void deDondeEres() {
		System.out.println(getRegion());
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
