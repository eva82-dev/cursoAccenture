package ejercicio8;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Alumno extends Persona  {
	
	//private String[]asignaturas;
	Set<String>asinaturas= new TreeSet<String>();
	private int curso;
	
	public Alumno(String codPersona, String nombre,String telContacto, int edad) {
		super (codPersona, nombre,telContacto,edad);
		setAsinaturas(asinaturas);
		setCurso(curso);

	}

	public void setAsinaturas(Set<String> asinaturas) {
		
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	@Override
	public void mostrar() {
		System.out.println("Alumno: "+ "\nasignaturas="+ asinaturas + ", curso=" + curso);
	


	

	
	}

	
}
