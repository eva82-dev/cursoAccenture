package ejercicio7;

public class Fecha2 {

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
		
		if (diames<=mes)
			System.out.println("fecha correcta");
		else 
		System.out.println("fecha incorrecta");
	
					}
		}
		}
			