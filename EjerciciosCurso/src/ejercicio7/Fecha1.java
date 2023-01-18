package ejercicio7;

public class Fecha1 {

		static int dia= 20;
		static int mes= 8;
		static int ano= 2015;
		
	public static void main(String[] args) {
		
		
	}
		public void fechaCorrecta() {
			if (dia<=30) {
					if (mes<=12&&mes>=0) {
						if (ano>=0) {
					System.out.println("la año es incorrecta, prueba otra vez");
		
				}else {
				System.out.println("la año es incorrecta, prueba otra vez");
				}
				}
				else {
				System.out.println("el mes es incorrecta, prueba otra vez");
				}
			}
				else {
				System.out.println("el día es incorrecto, prueba otra vez");
			}
		}
		


}
