package ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class UsoPersona {
	

	public static void main(String[] args) {
	 Alumno alumno = new Alumno("jjjjjj", "nose", null, 0);
	 Profesor profe= new Profesor("jjjj", "jjjj", null, 0, 0, null);
	
	
	List<Persona>datos = new ArrayList<Persona>();	//distinto tipo que se almacenan en Equipo
	datos.add(alumno);
	datos.add(profe);
	
	alumno.setAsinaturas(null);
	
	
	
	alumno.mostrar();
	System.out.println("---------------");
	}
}

