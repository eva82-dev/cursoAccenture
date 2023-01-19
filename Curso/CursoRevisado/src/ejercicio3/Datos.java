package ejercicio3;

public class Datos {
	/**
	 *  Escribe la clase Datos, en la misma, define las siguientes variables:
	 *  - dia, con un valor inicial de 10
	 *  - nDni, para números de DNI, con un valor inicial de 57.433.222
	 *  - precio para valores numéricos con dos decimales
	 *  - una constante con nombre «ACTIVO», y con valor true
	 *  - carga la variable precio con el valor 135.12
	 *  Preséntalo todo en consola con un aspecto semejante a este:
	 *  - 2015-09-24_19h43_44
	 *  Por ultimo, modificar el programa, guardándolo con el nombre Datos2, y haciendo que las variables puedan ser vistas por cualquier método de la clase.
	 * @param args
	 */

	
		static int dia=10;
		static double nDni= 57433.222;
		static final boolean ACTIVO= true;
		static double precio;
		
		public static void main(String[] args) {
			
			
			precio=135.12;
			
			
			System.out.println("dia\t="+dia);
			System.out.println("Dni\t="+nDni);
			System.out.println("Activo?\t="+ACTIVO);
			System.out.println("precio\t="+precio);
	
		
		

	}

}
