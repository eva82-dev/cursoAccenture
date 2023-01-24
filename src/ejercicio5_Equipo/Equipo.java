package ejercicio5_Equipo;

public abstract class Equipo {
	
	private int id;
	private String nombre;
	private	String apellidos;
	private int edad;
	
	public Equipo(int id, String nombre, String apellidos, int edad) {
		setId(id);
		setNombre(nombre);
		setApellidos(apellidos);
		setEdad(edad);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void concentrarse() {
		System.out.println("el equipo se concentrar");
	}
	
	public void viajar() {
		System.out.println("el equipo viaja");
	}

	@Override
	public String toString() {
		return "\nEquipo= "+"id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad ;
	}
	


	
	
}
