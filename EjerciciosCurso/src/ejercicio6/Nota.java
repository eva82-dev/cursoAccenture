package ejercicio6;

public class Nota {

		static int nota= 6;
		
	public static void main(String[] args) {
		
		
		switch(nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("insuficiente");
			break;
		case 5:
			System.out.println("suficiente");
			break;
		case 6:
			System.out.println("bien");
			break;
		case 7:
		case 8:
			System.out.println("notable");
			break;
		case 9:
		case 10:
			System.out.println("sobresaliente");
			break;
		}

	}

}
