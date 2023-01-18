package ejercicio5;

public class Factura {

	
	public static void main(String[] args) {
		int cantidad;
		int unidades;
		double precio;
		double importe;
		int total;
		
		
		cantidad= 3;
		unidades = 12;
		precio= 5.40;
		
		importe= cantidad*unidades*precio;
		total= (int)(importe * 1.21);
	 
	
				
		System.out.println("cantidad\t =" + cantidad);
		System.out.println("unidades\t =" + unidades);
		System.out.println("precio\t\t =" + precio);
		System.out.println("Importe\t\t =" + importe);
		System.out.println("Iva \t\t =" + importe*0.21  );
		System.out.println("total \t\t =" + total +"		debería ser="+importe*1.21);
	}

}
