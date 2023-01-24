package ejercicio3_Agroalimentaria;

public class CongeladosNitrogeno extends Congelados {
	
	
	private int tiempoExposicion= 3; 
	
	public CongeladosNitrogeno() {
	
	}

	public int getTiempoExposicion() {
		return tiempoExposicion;
	}

	public void setTiempoExposicion(int tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}
	public void congelacionEmpleado() {
		System.out.println(tiempoExposicion);
	}

	@Override
	public String toString() {
		return "CongeladosNitrogeno: tiempo de Exposicion=" + tiempoExposicion;
	}
	
}
