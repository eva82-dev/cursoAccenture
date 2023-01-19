package ejercicio4;

public class Ejercicio2Factura {
	/**
	 * Has de preparar un programa que calcule una linea de factura, para ello, 
	 * tienes las variables:
	 * - cantidad (int)
	 * - unidades(int)
	 * - precio(double)
	 * - importe(double)
	 * - total(int)
	 * @param args
	 */

	
	public static void main(String[] args) {
		int cantidad;
		int unidades;
		double precio;
		double importe;
		int total;
		
		/**
		 * Los cálculos que debes realizar son:
		 * - el importe = cantidad multiplicado por las unidades y 
		 * multiplicado por el precio
		 * - el total es el resultado de multiplicar el importe por 1,21.
		 * Ten en cuenta que puedes necesitar utilizar «cast»
		 * - el valor de iva es el 21% del importe.
		 */
		
		cantidad= 3;
		unidades = 12;
		precio= 5.40;
		
		importe= cantidad*unidades*precio;
		total= (int)(importe * 1.21);//tenemos que hacer un cast porque el cambio entre 
									 //double e int no es automático
	 
	
				
		System.out.println("cantidad\t =" + cantidad);
		System.out.println("unidades\t =" + unidades);
		System.out.println("precio\t\t =" + precio);
		System.out.println("Importe\t\t =" + importe);
		System.out.println("Iva \t\t =" + importe*0.21  );
		System.out.println("total \t\t =" + total + "debería ser=" + importe*1.21);
	}

}
