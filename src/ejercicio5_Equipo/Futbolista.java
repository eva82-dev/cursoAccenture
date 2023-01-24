package ejercicio5_Equipo;

public class Futbolista extends Equipo {
	
	private int dorsal;
	private String demarcacion;
	
	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal,String demarcacion) {
		super(id, nombre,apellidos,edad);
		setDorsal(dorsal);
		setDemarcacion(demarcacion);
		
			
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getDemarcacion() {
		return demarcacion;
	}
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
	@Override
	public void concentrarse() {
		System.out.println("el futbolista se concentrar");
	}
	@Override
	public void viajar() {
		System.out.println("el futbolista viaja");
	}
	public void jugarPartido () {
		System.out.println("el futbolista juega");
	}
	public void entrenar () {
		System.out.println("el futbolista entrena");
	}
	@Override
	public String toString() {
		return "\nFutbolista"+ super.toString()+ "dorsal= " + dorsal + ", demarcacion=" + demarcacion;
	}

	
}