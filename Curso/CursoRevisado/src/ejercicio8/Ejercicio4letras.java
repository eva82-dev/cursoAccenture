package ejercicio8;

public class Ejercicio4letras {
	/**
	 * Hacer una clase que convierta de números a letras, definiendo num=72. 
	 * Podéis hacer una primera version en donde los números del 11 al 15 salgan 
	 * como diez y uno, diez y dos…. y una segunda version corregida. 
	 * @author eva.del.olmo.garcia
	 *
	 */

	public static void main(String[] args) {
	
		int num=72;
		
		String []parte1= {" ", "uno","dos","tres","cuatro","cinco","seis","siete","ocho", "nueve"};
		String []parte2= {" ", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "ochenta", "noventa"};
		
		
	
	int unidades;
	int decenas;
	
	unidades= num%10;
	decenas= num/10;
	System.out.println(parte2[decenas]+ "y" + parte1[unidades]);
		
	}
}
