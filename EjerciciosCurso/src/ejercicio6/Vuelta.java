package ejercicio6;

public class Vuelta {

	public static void main(String[] args) {// es un array con cada palabra de nuestra frase
		
		//1
		
		System.out.println(args[0]); // imprime la primera palabra (posición 0)
		String salida = "";
		String salida2 = "";
		for (String ele : args) { // recibo en ele todo lo que contiene args
			// el espacio lo ponemos para que contenga un espacio después de cada elemento
			salida = salida + ele + " ";
			salida2 = ele + salida + " ";

		}

		System.out.println(salida);
		System.out.println("la frase al revés 1 :" + salida);
		
		
		//2
		
		String[] palabras = salida.split(" ");// lo separo en partes
		int fin = palabras.length; // fin es la longitud de la frase
		String salida3 = " ";
		for (int i = fin - 1; i >= 0; i--) {// cuando i sea 0, salgo
			salida3 = salida3 + palabras[i] + " ";
		}
		System.out.println("la frase al revés 2 :" + salida3);

		//3
		
		int longitud = salida.length();
		String salida4 = " ";
		for (int i = longitud - 1; i >= 0; i--) {
			salida4 += salida.charAt(i);

		}

		System.out.println(salida4);
		
		//4
		
		String salida5 = " ";
		int ls = salida.length();
		for (int i = ls - 1; i >= 0; i--) {
			char nose = salida.charAt(i);
			
			//nose = conver(nose);
			//salida5+= nose;
			
		switch (nose) {
		case 'a':
			nose=4;
			break;
		case 'e':
		case 'E':	
			nose=3;
			break;
		case 'i':
			nose=1;
			break;
		case 'o':
			nose=0;
			break;
		case 'u':
			nose=9;
			break;
		}
			//return nose;
		salida5 += nose;
		}
		System.out.println(salida5);
		
		
		//6
		
		char caracterFinal = salida.charAt(0);//extraigo la frase
		String salida6= "";
		for (int a = 1; (salida + caracterFinal).charAt(a)!= caracterFinal; a++) { 
			//empieza en el primer carácter, coge la frase + ese carácter
			// y cuando la frase sea distinto de ese carácter parará
			System.out.println(salida.charAt(a));
			salida6 = salida.charAt(a)+ salida6;
			

		}
		System.out.println();
		System.out.println(salida6);
		
		//7
		
		salida += (char) 0; //le añado el caracter 0 y ahí termina
		int pos= 0;
		String salida7 = " ";
		
		while (salida7.charAt(pos)!= (char) 0) {
			salida7 = salida.charAt(pos++)+ salida7;
		}
		System.out.println(salida7);
		
		
		
		
		
				
		
		

	}

	
	
}
