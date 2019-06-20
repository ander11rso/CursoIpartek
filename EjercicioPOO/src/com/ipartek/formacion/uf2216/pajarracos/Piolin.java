package com.ipartek.formacion.uf2216.pajarracos;

public class Piolin extends Canario {
		private int numPelis;

	public Piolin(int numPelis, int tamaño, String sexo, int edad) {
		super(tamaño, sexo, edad);
		setNumPelis(numPelis);
	}
	

	public static void main(String[] args) {
		
		Piolin[] teamPiolin = new Piolin[3];
		teamPiolin[0]=new Piolin(3, 30, "M", 3);
		teamPiolin[1]=new Piolin(25, 80, "M", 4);
		teamPiolin[2]=new Piolin(13, 10, "H", 1);
		
		
//		Piolin pio1 = new Piolin(3, 30, "M", 3);
//		Loro loro1 = new Loro("H", 2, "Norte", "Multicolor");
//		loro1.quienSoy();
//		pio1.quienSoy();
//		pio1.altura();
//		loro1.deDondeEres();
//		pio1.setTamaño(14);
//		pio1.altura();
//		loro1.setRegion("Sur");
//		loro1.numAves();
//			
		

	}
	
	@Override
	public void cantar() {
		System.out.println("Pio-pio soy un Piolín");
	}
	

	public int getNumPelis() {
		return numPelis;
	}

	public void setNumPelis(int numPelis) {
		this.numPelis = numPelis;
	}

}
