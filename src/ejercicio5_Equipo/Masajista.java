package ejercicio5_Equipo;

public class Masajista extends Equipo {
	
	private String titulacion;
	private int aniosExperiencia;

	public Masajista(int id, String nombre, String apellidos, int edad, int aniosExperiencia, String titulacion) {
		super(id, nombre,apellidos,edad);
		setTitulacion(titulacion);
		setAniosExperiencia(aniosExperiencia);
		
}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	@Override
	public void concentrarse() {
		System.out.println("el masajista se concentrar");
	}
	@Override
	public void viajar() {
		System.out.println("el masajista viaja");
	}
	public void darMasajes() {
		System.out.println("el masajista da masajes");
	}

	@Override
	public String toString() {
		return "\nMasajista" + super.toString() +" titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + ", getTitulacion()="
				+ getTitulacion() + ", getAniosExperiencia()=" + getAniosExperiencia();
	}


}