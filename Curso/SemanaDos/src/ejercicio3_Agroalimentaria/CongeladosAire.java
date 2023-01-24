package ejercicio3_Agroalimentaria;

public class CongeladosAire extends Congelados {

		private int nitrogeno= 7;
		private int oxigeno= 5;
		private int dioxido= 7;
		private int vaporAgua=777;
		
		public CongeladosAire(int nitrogeno,int oxigeno,int dioxido,int vaporAgua, int tempCongelacion) {
		super();
			this.setDioxido(dioxido);
			this.setOxigeno(oxigeno);
			this.setVaporAgua(vaporAgua);
			this.setNitrogeno(nitrogeno);
			
		}
		
		public CongeladosAire() {
		
		}

		public int getNitrogeno() {
			return nitrogeno;
		}
		public void setNitrogeno(int nitrogeno) {
			this.nitrogeno = nitrogeno;
		}
		public int getOxigeno() {
			return oxigeno;
		}
		public void setOxigeno(int oxigeno) {
			this.oxigeno = oxigeno;
		}
		public int getDioxido() {
			return dioxido;
		}
		public void setDioxido(int dioxido) {
			this.dioxido = dioxido;
		}
		public int getVaporAgua() {
			return vaporAgua;
		}
		public void setVaporAgua(int vaporAgua) {
			this.vaporAgua = vaporAgua;
		}
		public void informacionAire() {
			System.out.println("nitrogeno: " +nitrogeno+" %"+ "oxigeno : "+ oxigeno+" %"+ "dioxido carbono: "+ dioxido+" %" + "vapor de agua: "+vaporAgua+" %");
		
			
		}

		@Override
		public String toString() {
			return "CongeladosAire: nitrogeno=" + nitrogeno + " %"+ ", oxigeno=" + oxigeno +" %"+ ", dioxido=" + dioxido+" %"
					+ ", vaporAgua=" + vaporAgua + " %";
		}
				
}
