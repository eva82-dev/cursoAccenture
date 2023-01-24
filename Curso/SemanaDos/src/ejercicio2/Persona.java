package ejercicio2;

public abstract class Persona implements Cosas {
	/**
	 * Crear Persona y que Cliente y Usuario hereden de ella
	 */
		private String nombre;
		private String direccion;
		private String correoElectronico;
		
		public  Persona() {
			
			/*
			 * Si lo creo y lo quiero usar tengo que definirlo con los
			 * mismos parámetros en las clases hijas
			 * super(String nombre, String direccion, String correoElectronico)
			 * 
			 * constructor con parametros Persona(String nombre, String direccion, 
			 * String correoElectronico){
			 * super();
			 * this.nombre= nombre;
			 * this.correoElectronico= correoElectronico;					
			 * this.direccion= direccion; 
			 * }*/
			
			}
		
		public Persona(String nombre2) {
			
		}

		//definir método abstract
		public abstract String aString(); //public si me da error
			/*si no utilizara abstract
			 * 
			 * public String aString();
			 * return nombre + " " +direccion+ " " +correoElectronico;
			 */
		

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getCorreoElectronico() {
			return correoElectronico;
		}

		public void setCorreoElectronico(String correoElectronico) {
			this.correoElectronico = correoElectronico;
		}
		
		public void crear() {
			System.out.println("creado");
		}
		public void borrar() {
			System.out.println("borrado");
		}
		public void enviarMensaje() {
			System.out.println("enviado");
		}
	

}
