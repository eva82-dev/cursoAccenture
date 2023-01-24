package ejercicio1;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		System.out.println("Pruebas de tipos");
		
		char c='A';
		double precio= 23.4;
		double iva=0.16;
		double importeTotal;
		importeTotal=precio*iva+precio;
		System.out.println("Caracter: "+c);
		System.out.println("Equivalencia unicode: " + (int)c);//lo muestra como integer(valor)
		System.out.println("Importe total: "+importeTotal);
		System.out.println("Primavera\nVerano\nOtoño\nInvierno");
		System.out.println("Lun\tMar\tMier\tJue\tVier");
		System.out.println("Lun\\Mar\\Mier\\Jue\\Vier");
		System.out.println("\"Cocodrilo\"");
		
		
	}

}
