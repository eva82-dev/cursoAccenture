package ejercicio9;

public class Ejercicio10Cuadrado {
	
	/**
	 * Dibuja un cuadrado, como en la imagen que acompaña, con ocho * de lado:
	 * @author eva.del.olmo.garcia
	 *
	 */
	
	public static void main(String[] args) {
		int arterisco= 8;
		int i; 
		int j;
		
		for(i=0; i<=arterisco; i++) {//fila
			for(j=0; j<=arterisco; j++)//columna
			System.out.println("*");
		}
		System.out.println("");


	}

}
