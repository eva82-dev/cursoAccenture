package ejercicio4_Dibujos;

public class Circulo extends FiguraGeometrica{

		private int radio=5;
		private final double PI= Math.PI;
		private int area;
		
		
		public Circulo (int radio,int superficie,int lado, int tamaño, double PI, int area) {
		super(superficie, tamaño, lado);
		super.setTamaño(8);
		this.setRadio(radio);
		this.setPI(PI);
		this.setArea(area);
		
		/*Circulo(int radio){
		 * super(radio);
		 * super.nombre= "Circulo";
		 * 
		 */
		}
		
		public Circulo() {
		}
		
		//setter de PI	
		private void setPI(double pI2) {	
			
		}
		
		public String afiguras() {
			return "el Circulo: "+ radio + area;
		}
		
		public int getRadio() {
			return radio;
		}

		public void setRadio(int radio) {
			this.radio = radio;
		}

		public double getPI() {
			return PI;
		}
		
		public int getArea() {
			return area;
		}

		public void setArea(int area) {
			this.area = area;
		}

		@Override
		public void calcularArea() {
			area= (int) PI*(radio*radio);
			System.out.println("el area del circulo es: "+ area);
		}
		/* public double area(
		 * 
		 */
		
		@Override
		public void dibujar(){
			System.out.println("imprimiendo la figura de un círculo de tamaño = " + area);
			
		}		
		
}
