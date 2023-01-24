package ejercicio4_Dibujos;

public abstract class FiguraGeometrica { //definimos la clase como abstracta para poder compartir los métodos
	
	/**
	 * Crear la clase padre FiguraGeométrica de la que heredan Círculo, Triángulo y Rectángulo.
	 * Comparten los métodos dibujar y calculaArea
	 */
	
		//atributos
		//private int alto
		private int lado;
		private int superficie;
		private int tamaño;
		Punto punto;//instancio punto
		Texto texto;//instancio texto
		
		
		/*
		FiguraGeometrica(int radio) { //para usar en Circulo radio
			ancho= radio*2;
			alto= radio*2;
			
		}*/
		
		public Punto getPunto() {
			return punto;
		}
		public void setPunto(Punto punto) {
			this.punto = punto;
		}
		//constructor vacío
		public FiguraGeometrica() {
		}
		//constructor con parámetros
		public FiguraGeometrica(int superficie, int tamaño, int lado) {
			super();
			this.setLado(lado);
			this.setSuperficie(superficie);
			this.setTamaño(tamaño);
			
		}
		
		
		//método para convertir la clase en abstracta		
		public abstract String afiguras();
		
		public int getLado() {
			return lado;
		}

		public void setLado(int lado) {
			this.lado = lado;
		}

		public int getSuperficie() {
			return superficie;
		}

		public int getTamaño() {
			return tamaño;
		}

		/*public void setRadio(int radio) { //puedo añadir radio de circulo en el padre
			this.radio = radio;
		}
		public int getRadio() {
			return alto/2;
		}*/

		public void setTamaño(int tamaño) {
			this.tamaño = tamaño;
		}

		public void setSuperficie(int superficie) {
			this.superficie = superficie;
		}
		
		//creación de métodos dibujar y calcularArea
		public void dibujar(){
		
			System.out.println("imprimiendo una figura de = "+ tamaño);
			
		}
		
		public void calcularArea() {
			superficie= lado* lado;
					
		
		}
		public void calcularArea(FiguraGeometrica figura) {
			
			
		}
		
}

