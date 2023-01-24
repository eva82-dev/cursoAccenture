package ejercicio3_Agroalimentaria;

public class Productos {
		
	
		/*protected porque de esa forma puedo acceder a ellos desde el método 
		toString de las clases hijas*/
		protected String fechaCaducidad= "7/09/09";
		protected int numLote;
		
		public Productos(String fechaCaducidad, String numLote){ 
			super();
<<<<<<< HEAD
			setFechaCaducidad(fechaCaducidad); //this.setFechaCaducidad(fechaCaducidad) si yo he hecho el metodo
			this.setNumLote(getNumLote());
=======
			this.setFechaCaducidad(fechaCaducidad);
			this.setNumLote(getNumLote());  <-------------------- this.setNumLote(numLote)
>>>>>>> fdf24dfe072bdc7a106113c7726cff8f649e91c5
			
		}

		public Productos() {
			
		}

		public String getFechaCaducidad() {
			return fechaCaducidad;
		}

		public void setFechaCaducidad(String fechaCaducidad) {
			this.fechaCaducidad = fechaCaducidad;
		}

		public int getNumLote() {
			return numLote;
		}

		public void setNumLote(int numLote) {
			this.numLote = numLote;
		}

		@Override
		public String toString() {
			
			return "Productos = \nfecha de Caducidad=" + fechaCaducidad + ", \tnum de Lote=" + numLote;
		}

}
		
		
