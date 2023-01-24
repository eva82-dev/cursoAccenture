package ejercicio5_Equipo;

public class Entrenador extends Equipo {
	private String idFederacion;
	
	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre,apellidos,edad);
		setIdFederacion(idFederacion);
	}	
	
	

	public String getIdFederacion() {
		return idFederacion;
	}
	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
	@Override
	public void concentrarse() {
		System.out.println("el entrenador se concentrar");
	}
	@Override
	public void viajar() {
		System.out.println("el entrenador viaja");
	}
	public void dirigir() {
		System.out.println("el entrenador dirige");
	}
	public void dirigirEntrenamiento() {
		System.out.println("el entrenador dirige el entrenamiento");
	}
	@Override
	public String toString() {
		return "\nEntrenador: "+ super.toString()+ "\tidFederado: " + idFederacion;
	}
	
}