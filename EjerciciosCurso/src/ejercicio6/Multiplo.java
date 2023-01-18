package ejercicio6;

public class Multiplo {
	

	static int num1= 10;
	static int num2= 20;


	public static void main(String[] args) {
	}
		
		public void igual() {
			if (num1==num2) {
				System.out.println(num1+" y "+num2+ " son iguales");
			}else {
				System.out.println("son desiguales, intentalo otra vez");
			}
		}
			
		
			
		
		public void mayor() {
			if (num1>num2) {
				System.out.println(num1+ "es el mayor");
			}else {
				System.out.println(num2+ "es el mayor");
			}
		}
		
		public void multiplo() {
			if (num2%num1==0 || num1%num2==0) {
				System.out.println(num2+ "es multiplo de "+ num1);
			}else {
				System.out.println("no son múltiplos");
			}
		
		}
}
