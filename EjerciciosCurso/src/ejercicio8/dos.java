package ejercicio8;

public class dos {
	int num=72;
	
	String []parte1= {" ", "uno","dos","tres","cuatro","cinco","seis","siete","ocho", "nueve", "diez", "once", "doce", "trece","catorce","quince"};
	
	String []parte2= {" ", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "ochenta", "noventa"};
	
	

	int unidades;
	int decenas;
	String mensaje ="";

	unidades= num%10;
	decenas= num/10;
	if(num<16) {
		System.out.println(parte1[num]);
	//mensaje= parte1[num];//el numero introducido es de parte1
	}else {
	System.out.println(parte2[decenas]+ "y" + parte1[unidades]);
		}
	}
}
