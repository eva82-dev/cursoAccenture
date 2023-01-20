package curso;

import java.time.LocalTime;

/**
 * 
 * @author eva.del.olmo.garcia
 * prueba de cómo definir los campos
 */

public class Definiciones{
	//inicializamos atributos
	//literales: false, 0, 0d
	private static boolean seguro= false;
	private static int importe = 0;
	private static double cantidad = 0d;
	//clase String
	public String nombre="";
	static String descripcion = "\"Hola \nmundo\"";
	public final String VALOR ="hola holita";
	
	
	
	
	//getters y setters
	public int getImporte() {
		return importe;
	}
	
	public void setImporte (int imp) {
		if (imp >= 0);
		importe = imp;
	}
	
	
	public static boolean isSeguro() {
		return seguro;
	}

	public static void setSeguro(boolean seguro) {
		Definiciones.seguro = seguro;
	}

	public static double getCantidad() {
		return cantidad;
	}

	public static void setCantidad(double cantidad) {
		Definiciones.cantidad = cantidad;
	}

	public static String getDescripcion() {
		return descripcion;
	}

	public static void setDescripcion(String descripcion) {
		Definiciones.descripcion = descripcion;
	}

	/**
	 * Lanzamiento por consola
	 * @param args
	 */
	
	public static void main(String[] args) {
		System.out.println(descripcion);
		int separador= 123;
		System.out.println(separador);
		Enlace ss= new Enlace();
		ss.modificacion();
		
		Enlace ss1= new Enlace();
		ss1.url= "http//fffkkfkfkf";
		ss1.hora= LocalTime.now();
		ss1.modificacion();
		
		
		Enlace ss2= new Enlace();
		ss2.url= "http//fffkkfkfkf";
		ss2.hora= LocalTime.now();
		ss2.modificacion();
		
	

	}
	public void valor() {
		importe= 123;
		cantidad = 500.22;
		char separador='/';
		
		seguro= true;
	}
}
