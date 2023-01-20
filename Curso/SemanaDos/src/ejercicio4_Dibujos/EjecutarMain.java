package ejercicio4_Dibujos;

import ejercicio3_Agroalimentaria.Congelados;

public class EjecutarMain {
		
	public static void main(String[] args) {
		
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
	}
}
