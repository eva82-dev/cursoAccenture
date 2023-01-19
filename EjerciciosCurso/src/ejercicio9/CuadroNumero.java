package ejercicio9;

public class CuadroNumero {
	/*
	 * Recibir una colección de números desde la linea de comandos, 
	 *	calcular su cuadrado y presentarlo en salida
	 */
	public static void main(String[] args) {
		
		/*Recibir una colección de números desde la linea de comandos, 
		calcular su cuadrado y presentarlo en salida*/
		
		int num;
		int cuadrado;
		for(String nums:args) {
			num = Integer.parseInt(nums);
			cuadrado= num*num;
			System.out.println("cuadrado");
		

		}
	}

}
