package ejercicio4;

public class Ejercicio1Circunferencia {
	/**
	 * Dado el radio, (23), calcular el área del circulo 
	 * y la longitud de la circunferencia
	 */
	
	static final double PI= Math.PI;//constante
	static final int Radio= 23;//puede ser constante o no, según el ejercicio

	public static void main(String[] args) {
		
		
		
		double longitud= 2*PI*Radio;
		double area= PI*(Radio*Radio);
		
		
		System.out.println(longitud);
		System.out.println(area);
		

	}

}
