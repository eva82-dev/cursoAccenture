package ejercicio4_Dibujos;

public class Rectangulo extends FiguraGeometrica{ //extiende de la clase FiguraGeometrica
	
	private int base= 8;
	private int altura= 9;
	private int areaRec;
	
	
	public Rectangulo (int base, int altura, int lado, int superficie, int tamaño, int areaRec) {
		super(superficie, lado, tamaño);
		this.setAltura(altura);
		this.setBase(base);
		this.setAreaRec(areaRec);
		
	}

	

	public Rectangulo() {
		
	}
	
	public String afiguras() {
		return "el Rectángulo: "+ altura + base;
	}

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
	
	public int getAreaRec() {
		return areaRec;
	}

	public void setAreaRec(int areaRec) {
		this.areaRec = areaRec;
	}

	@Override
	public void calcularArea() {
		areaRec= base*altura;
		System.out.println("el area del rectángulo es: " + areaRec);
	}
	
	
	@Override
	public void dibujar(){
			System.out.println("imprimiendo la figura de un rectángulo de tamaño = " + areaRec);
		
	}

}
