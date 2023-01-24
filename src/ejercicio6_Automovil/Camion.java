package ejercicio6_Automovil;

public class Camion extends Automovil {
	private double pesoMax;
	private double precio;
	
	public Camion (int numMarchas, double velocidadMax, int numChasis, double pesoMax, double precio) {
		super(numMarchas, velocidadMax, numChasis);
		setPesoMax (pesoMax);
		setPrecio (precio);
		
		
	}

	public double getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(double pesoMax) {
		this.pesoMax = pesoMax;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return  super.toString()+ "\nCamion:" + "pesoMax=" + pesoMax + ", precio=" + precio;
	}
	

}
