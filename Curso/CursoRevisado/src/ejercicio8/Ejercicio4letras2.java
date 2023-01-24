package ejercicio8;

public class Ejercicio4letras2 {
	/**
	 * Hacer una clase que convierta de números a letras, definiendo num=72. 
	 * Que imprima once, doce... etc.
	 * @author eva.del.olmo.garcia
	 *
	 */
	
	public static void main(String[] args) {
	
	int num=72;
	
	String []parte1= {" ", "uno","dos","tres","cuatro","cinco","seis","siete","ocho", "nueve", "diez", "once", "doce", "trece","catorce","quince"};
	String []parte2= {" ", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "ochenta", "noventa"};
	int unidades;
	int decenas;
	

	unidades= num%10;
	decenas= num/10;
	
	if (num<0) {
		if(num<16) {
		System.out.println(parte1[num]);//el numero sacado es de parte1
		
		}else {
			System.out.println(parte2[decenas]+ "y" + parte1[unidades]);//el numero sacado es de la parte2 y unidades de la parte1
			}
		}
	}
}
