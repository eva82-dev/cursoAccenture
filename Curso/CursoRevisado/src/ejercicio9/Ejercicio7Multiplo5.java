package ejercicio9;

public class Ejercicio7Multiplo5 {
	
	/**
	 * Calcular la suma de los primeros 10 números múltiplos de 5
	 * @author eva.del.olmo.garcia
	 *
	 */
	
	public static void main(String[] args) {
		
		int num=5;
		int cont=10;
		int indice= 0;
		long total= 0;
		
		while(cont>0) {
			if(++indice%num == 0) {
				--cont;
				total+=indice;
				System.out.println(indice);
				}
			System.out.println(total);
		}
	}
}
