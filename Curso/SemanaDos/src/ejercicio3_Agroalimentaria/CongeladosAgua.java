package ejercicio3_Agroalimentaria;

public class CongeladosAgua extends Congelados {

	private int sanilidad;
	
		public CongeladosAgua(int tempCongelacion, int sanilidad) {
		super();
		this.setSanilidad(sanilidad);
			
		}
	

		public CongeladosAgua() {
			
		}

		public int getSanilidad() {
			return sanilidad;
		}

		public void setSanilidad(int sanilidad) {
			this.sanilidad = sanilidad;
		}


		@Override
		public String toString() {
			return "CongeladosAgua: sanilidad=" + sanilidad;
		}
		
}
