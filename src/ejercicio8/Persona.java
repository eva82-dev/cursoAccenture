package ejercicio8;

public abstract class Persona {
	private String codPersona;
	private String nombre;
	private int edad;
	private String telContacto;
	
	public Persona(String codPersona, String nombre,String telContacto, int edad) {
		setCodPersona(codPersona);
		setNombre(nombre);
		setEdad(edad);
		setTelContacto(telContacto);
		
	}

	public String getCodPersona() {
		return codPersona;
	}

	public void setCodPersona(String codPersona) {
		this.codPersona = codPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelContacto() {
		return telContacto;
	}

	public void setTelContacto(String telContacto) {
		this.telContacto = telContacto;
	}
	
		
	
	
	public void mostrar() {
		System.out.println("Persona :"+ "\ncodPersona=" + codPersona + ", nombre=" + nombre + ", edad=" + edad + ", telContacto="
				+ telContacto);
	}

	
	

}
