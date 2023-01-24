package ejercicio7;

public class Fecha1 {
	
	/**
	 * hacer una clase, definiendo día=20, mes =8,año = 2015, y luego añadir
	 * el código para comprobar que la fecha es correcta.
	 * En la primera version, asumir meses de 30 dias.
	 * @author eva.del.olmo.garcia
	 *
	 */
	
	

	static int dia= 20;
	static int mes= 8;
	static int ano= 2015;
		
	public static void main(String[] args) {
	}	
		
	
		public void fechaCorrecta() {
			if (dia<=30) {
					if (mes<=12&&mes>=0) {
								
						if (ano>=0) {
					System.out.println("fecha correcta");
						}else {
							System.out.println("la año es incorrecta, prueba otra vez");
						}
						
					}else {
						System.out.println("el mes es incorrecta, prueba otra vez");
					}
					
			}else {
				System.out.println("el día es incorrecto, prueba otra vez");
			}
		
		
	}

}
