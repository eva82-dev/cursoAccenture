package ejercicio6_Automovil;

import ejercicio7_Interface.Abd;
import ejercicio7_Interface.AccesoABC;

public abstract class Automovil implements Abd{
	/**
	 * Tenemos el objeto Camión, Coche, Moto y dentro de coche podemos definir modelos (Seat, Renault, Ford...)
	 * Los atributos vistos en resumen:
	 * 	- numero marchas
	 * 	- peso máximo (Camion)
	 * 	- valocidad máxima
	 * 	- color (Coche)
	 * 	- precio (camion)
	 * 	- numero puertas (coche)
	 * 	- numero chasis
	 */
	
	private int numMarchas;
	private double velocidadMax;
	private String color;
	private int numChasis;
	
	public Automovil (int numMarchas, double velocidadMax, int numChasis) {
		this();
		this.numMarchas = numMarchas;
		this.velocidadMax=velocidadMax;
		this.numChasis= numChasis;
		AccesoABC dao= new AccesoABC();//ejerccio7
		dao.AccesoLeer(this);
		dao.AccesoGrabar(this);
		
		
		/*static {
			contador=1500;
		}
		Automovil(){
			setMatricula("B"+ ++contador)
		}*/

}

	public Automovil() {
		
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public double getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(double velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public int getNumChasis() {
		return numChasis;
	}

	public void setNumChasis(int numChasis) {
		this.numChasis = numChasis;
	}

	@Override
	public String toString() {
		return "Automovil: numMarchas=" + numMarchas + ", velocidadMax=" + velocidadMax + ", color=" + color
				+ ", numChasis=" + numChasis;
	}

	@Override //interface Abd
	public void leer(Abd obj) {
		//convierte SQL a dominio
		
		
	}

	@Override
	public void grabar(Abd obj) {
		// convierte dominio a SQL
		
	}
	
}
