package ejercicio4_Dibujos;

public class Triangulo extends FiguraGeometrica {
	
	private int base= 7;
	private int altura= 8;
	private int areaTri;
	
	//Constructor con parámetros
	public Triangulo (int base, int altura, int areaTri, int lado, int superficie, int tamaño) {
		super(tamaño, superficie, lado);
		this.setBase(base);
		this.setAreaTri(areaTri);
		this.setAltura(altura);	
		
	}
	//Constructor vacío
	public Triangulo() {
		
	}
	
	//Conectamos con la clase padre abstracta
	public String afiguras() {
		return "el Triangulo: "+ base + altura + areaTri;
	}

	//Getters y Setters
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAreaTri() {
		return areaTri;
	}

	public void setAreaTri(int areaTri) {
		this.areaTri = areaTri;
	}
	
	//Sobreescritura de métodos calcularÁrea y dibujar
	@Override
	public void calcularArea() {
		areaTri= base*(altura/2);
		System.out.println("el área del triángulo es: "+ areaTri);
	}
	
	
	@Override
	public void dibujar(){
		System.out.println("imprimiendo la figura de un círculo de tamaño = " + areaTri);
		
	}
	
}
