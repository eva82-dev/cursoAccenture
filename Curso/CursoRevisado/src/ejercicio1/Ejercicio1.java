package ejercicio1;

public class Ejercicio1 {
	/**
	 * Escribe, compila y ejecuta una clase que escriba en la consola «Hola Mundo!»
	 * @param args
	 */

	public static void main(String[] args) {
		
		System.out.println("Hola Mundo");
		
		
	/**
	 * Escribe, compila y ejecuta una clase que defina las variables a, b, c, y d 
	 * con los valores 11, 27,37 y 47 respectivamente, y escribe en la consola los
	 * valores de esta forma.
	 */
		
		
		System.out.println("Pruebas de tipos");
		
		char c='A';
		double precio= 23.4;
		double iva=0.16;
		double importeTotal;
		importeTotal=precio*iva+precio;
		System.out.println("Caracter: "+c);
		System.out.println("Equivalencia unicode: " + (int)c);//lo muestra como Integer(valor)
		System.out.println("Importe total: "+importeTotal);
		System.out.println("Primavera\nVerano\nOtoño\nInvierno");
		System.out.println("Lun\tMar\tMier\tJue\tVier");
		System.out.println("Lun\\Mar\\Mier\\Jue\\Vier");
		System.out.println("\"Cocodrilo\"");
		
		
	}

}
