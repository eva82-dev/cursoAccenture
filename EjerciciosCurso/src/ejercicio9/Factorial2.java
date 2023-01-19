package ejercicio9;

/*
 * 
 *	 Calcular el factorial del numero 8. Otra forma
 */

public class Factorial2 {

	public static void main(String[] args) {
		int fact=8;
		System.out.println (factorial(fact));
	} 

	 static int factorial(int num) {
		 if(num>1)
			 return num*factorial(--num); //va hacia atrás
			else
		 return num;

	}

}
