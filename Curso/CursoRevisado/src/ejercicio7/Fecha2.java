package ejercicio7;

public class Fecha2 {
	
	/**
	 * hacer una clase, definiendo día=20, mes =8,año = 2015, y luego añadir
	 * el código para comprobar que la fecha es correcta.
	 * En la primera version, asumir meses de 30 dias.
	 * @author eva.del.olmo.garcia
	 *
	 */

	public static void main(String[] args) {
	}
		public static void verFecha(int dia, int mes, int ano) {
		int diames;
	
				if (mes <=1 &&mes<=12)
					if (ano<=0) {
		switch (mes) {
		case 1: case 5: case 7: case 8: case 10: case 12: 
			diames=30;
			break;
		case 4: case 6: case 9: case 11:
			diames= 30;
			break;
		}
		if (dia<=mes)
			System.out.println("fecha correcta");
		else 
		System.out.println("fecha incorrecta");
	
				}		
		}

}
		
			