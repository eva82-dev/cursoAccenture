package ejercicio4;

public class Datos4 {

	public static void main(String[] args) {
	
						
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
		
	}

	

}
