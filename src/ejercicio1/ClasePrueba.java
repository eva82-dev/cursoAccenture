package ejercicio1;

public class ClasePrueba {
	
	public static void main(String[] args) {
		Intercambio<String>primero=new Intercambio<String>("Manuel","Pedro");
		Intercambio<Integer>segundo= new Intercambio<Integer>(20,30);
		
		String text1= primero.getPrimero();
		int numero1=segundo.getPrimero();
		
		System.out.println("texto1 ="+primero+"         texto2 ="+segundo);
		primero.Intercambio();		
		segundo.Intercambio();
		text1= primero.getPrimero();
		numero1 = segundo.getPrimero();
		
		System.out.println(primero.getPrimero());
		
	}

}
