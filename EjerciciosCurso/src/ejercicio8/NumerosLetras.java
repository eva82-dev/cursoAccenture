package ejercicio8;

public class NumerosLetras {

	public static void main(String[] args) {
	
		int num=72;
		
		String []parte1= {" ", "uno","dos","tres","cuatro","cinco","seis","siete","ocho", "nueve"};
		
		String []parte2= {" ", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "ochenta", "noventa"};
		
		
	
	int unidades;
	int decenas;
	
	unidades= num%10;
	decenas= num/10;
	System.out.println(parte2[decenas]+ "y" + parte1[unidades]);
	
	

}}
