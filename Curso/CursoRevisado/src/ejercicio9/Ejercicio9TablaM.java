	package ejercicio9;
	
	/**
	 * Presentar en consola las tablas de multiplicar del 1 al 10
	 * @author eva.del.olmo.garcia
	 *
	 */

	public class Ejercicio9TablaM {

		public static void main(String[] args) {

			int []numero1= {1,2,3,4,5,6,7,8,9,10};
			int []numero2= {1,2,3,4,5,6,7,8,9,10};
			int i,j;
		
			for (i=0; i<numero1.length; i++);//recorro la primera array
		
			for (j=0; j<numero2.length; j++);//recorro la segunda array
			
	
			System.out.println(i+ " x "+ j+ "=" +i*j);//las imprimo y las multiplico
	}

	

	
}
