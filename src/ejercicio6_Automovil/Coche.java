package ejercicio6_Automovil;

public class Coche extends Automovil implements CuatroxCuatro {

	private int numPuertas;
	private boolean situacion4x4; //de la interface
	
	public Coche (int numMarchas, double velocidadMax, int numChasis, int numPuertas) {
		super(numMarchas, velocidadMax, numChasis);
		setNumPuertas(numPuertas);
		
}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
		
	}
	public static void modelo(String nombre) {
		System.out.println("el modelo es :"+ nombre);
	}
	 
	@Override
	public String toString() {
		return super.toString()+"\nCoche : numPuertas=" + numPuertas ;
	}

	@Override //interface
	public void activarReductora(boolean activar) {
		situacion4x4=activar;
		
	}
	
}
