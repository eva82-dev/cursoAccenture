package ejercicio7_Interface;

public class AccesoABC implements Abd{ //mirar clase Automovil
		
		/**
		 * reciben Coches, Motos, Cuadrados, Rectangulos...
		 */
	
		public void AccesoLeer(Abd rece) {//para que lo siguiente ocurra necesita que cumpla la interfaz
			//abre base de datos
			//prepara SQL
			//ejecuta SQL...
			rece.leer(rece);
			System.out.println("leido");
		}
		public void AccesoGrabar(Abd rece){
			
			rece.grabar(rece);
			System.out.println("grabado");
			
		}
		
		
}
