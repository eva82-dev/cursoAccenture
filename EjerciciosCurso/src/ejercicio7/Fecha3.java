package ejercicio7;

public class Fecha3 {

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
