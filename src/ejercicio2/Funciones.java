package ejercicio2;

public class Funciones {

	public static void grabar(Persona per) { 
		per.aString();
		if (per instanceof Cliente) { 
		Cliente ss = (Cliente)per;
		ss.aString();		
		
		}
		if (per instanceof Usuario) {
			Usuario ss = (Usuario)per;
			ss.aString();
		}

	}
}
