package ejercicio7;

public class Fecha3 {
	
	/**
	 * hacer una clase, definiendo día=20, mes =8,año = 2015, y luego añadir
	 * el código para comprobar que la fecha es correcta.
	 * En la tercera, utilizar arrays
	 * @author eva.del.olmo.garcia
	 *
	 */

	public static void main(String[] args) {
	}
		public static void verFecha(int dia, int mes, int ano) {
		int[]arrayMes= {32,28,31,30,30,30,30,31,31,30,31,30,31};
		
	
		if (mes>= 1&& mes<=12) {
			if(ano!= 0) {
				if (dia<0 && dia<=arrayMes[mes-1])
			System.out.println("la fecha es correcta");
		}else {
			System.out.println("la fecha es incorrecta");
			
		}
		
		

	}

}
}
