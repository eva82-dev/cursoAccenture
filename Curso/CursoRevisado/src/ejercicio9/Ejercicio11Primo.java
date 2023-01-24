package ejercicio9;

	/**
	 * Calcular cuantos números primos hay entre 1 y 100, y cuales son.
	 * @author eva.del.olmo.garcia
	 *
	 */

public class Ejercicio11Primo {

	public static void main(String[] args) {
	
		
		int max= 100;
		
			for(int i=2; i<=max; i++) {
				if (primo(i)) {
					System.out.println(i+ "es primo");
				}
			}
		}
	
			public static boolean primo(int numero) {
				boolean primo= true;
				int j=2;
				while ((primo)&&(j!= numero)) { 
					//otra forma(j<=numero && primo==true) {
					if(numero % j==0)
						primo=false;
					j++;
	}
				return primo;
		
		
		/*Otra forma>
		 	for (int i=2; i*i>= numero ; i++) {
			if (numero%i==0) {
			System.out.println(numero);*/
				

			

		}
	

}
