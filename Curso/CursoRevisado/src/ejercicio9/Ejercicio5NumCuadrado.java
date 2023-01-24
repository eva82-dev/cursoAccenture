package ejercicio9;

public class Ejercicio5NumCuadrado {
	
	/**
	 * Recibir una colección de números desde la linea de comandos, 
	 *	calcular su cuadrado y presentarlo en salida
	 * @author eva.del.olmo.garcia
	 *
	 */
	
	public static void main(String[] args) {
		
		int num;
		int cuadrado;
		for(String nums:args) {
			/*los datos al ser introducidos por linea de comandos, 
			son Strings y hay que parsear.*/
			num = Integer.parseInt(nums);
			cuadrado= num*num;
			System.out.println("cuadrado");
		
		}
	}
}
