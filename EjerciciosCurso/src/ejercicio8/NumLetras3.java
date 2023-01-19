package ejercicio8;

public class NumLetras3 {
	
	public static void main(String[] args) {
		
	int num=72;
	int unidades;
	int decenas;
	
	String []parte1= {"uno","dos","tres","cuatro","cinco","seis","siete","ocho",
			"nueve", "diez", "once", "doce", "trece","catorce","quince"};
	
	String []parte2= {"diez", "veinte", "treinta", "cuarenta", "cincuenta", 
			"sesenta", "setenta","ochenta", "noventa"};
	
	unidades= num%10;
	decenas= num/10;
	String mensaje ="";
	
	if (num>0) {
		if(num<16) {
		System.out.println(parte1[num-1]);
		mensaje= parte1[num];//el numero introducido es de parte1
	}else {
		System.out.println(parte1[decenas-1]);
		mensaje= parte2[num];//el numero introducido es de parte1
	
			}
		}
	}
}
