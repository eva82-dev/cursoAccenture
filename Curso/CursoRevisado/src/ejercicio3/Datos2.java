package ejercicio3;

public class Datos2 {
	
	/**
	 * Escribe la clase DatosArray, y en la misma define las siguientes variables:
	 * - Un array que contenga los días que tienen los 12 meses
	 * - Un array de dos dimensiones, una de 5 elementos, y cada elemento de 7 elementos
	 * - Rellenarlos con  números secuenciales de 1 a 31
	 */
	
	
	
	public static void main(String[] args) {
		
		
int []diaMeses= {31,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int [][]arrayUno= new int[5][7];
	
		//añadimos por posición
		
		arrayUno [0][0]=1;
		arrayUno [0][1]=2;
		arrayUno [0][2]=3;
		arrayUno [0][3]=4;
		arrayUno [0][4]=5;
		arrayUno [0][5]=6;
		arrayUno [0][6]=7;
		arrayUno [1][0]=8;
		arrayUno [1][1]=9;
		arrayUno [1][2]=10;
		arrayUno [1][3]=11;
		arrayUno [1][4]=12;
		arrayUno [1][5]=13;
		arrayUno [1][6]=14;
		arrayUno [1][0]=8;
		arrayUno [1][1]=9;
		arrayUno [1][2]=10;
		arrayUno [1][3]=11;
		arrayUno [1][4]=12;
		arrayUno [1][5]=13;
		arrayUno [1][6]=14;
		
		/*Otra forma:
		int [][]arrayUno= new int[5][7];
		
		for (int a=0; a<5; a++) {
			a= a+1;
			for (int b=0; b<7; b++) {
				arrayUno[a][b]=a+b;
				
			}
		}
		int contador= 0;
		for (int a=0; a<arrayUno.length; a++) {
			a= a+1;
			for (int b=0; b<arrayUno[a].length; b++) {
				if (contador<=31) {
			
				arrayUno[a][b]=++contador;
				}else {
					break;
			}
		}
	}
	
}*/


	}
}
