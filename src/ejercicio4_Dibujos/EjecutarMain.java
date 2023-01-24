package ejercicio4_Dibujos;

import ejercicio3_Agroalimentaria.Congelados;

public class EjecutarMain {
		
	public static void main(String[] arg) {
		
		//instanciamos las clases
		Circulo circulo = new Circulo();
		Rectangulo rectangulo = new Rectangulo();
		Triangulo triangulo = new Triangulo();
		
		//imprimimos los métodos
		circulo.calcularArea();
		circulo.dibujar();
		System.out.println("--------------------");
		rectangulo.calcularArea();
		rectangulo.dibujar();
		System.out.println("--------------------");
		triangulo.calcularArea();
		triangulo.dibujar();
		System.out.println("--------------------");
		triangulo.getPunto().getY(); //cojo el metido y del objeto punto
		System.out.println("--------------------");
		Punto punto= new Punto(5,6);//instancio
		circulo.setPunto(punto);//les doy los valores
		circulo.getPunto().invertir();//cojo invertir de punto
		System.out.println("--------------------");
		circulo.texto.getTitulo(); //como getTitulo de la clase titulo que he instanciado en la clase padre
	}
}
