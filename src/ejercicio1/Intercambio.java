package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Intercambio <T> {//cambio los tipos por T y la convierto en genérica

	/**
	 * Crear una clase genérica que intercambie los datos de primero y segundo
	 */
	
	//public static void main(String[] args) {
		private T primero;
		private T segundo;
		
		public  Intercambio(T primero, T segundo) {
			super();
			this.primero= primero;//setPrimero(primero)para sólo poder acceder él 
									//através de setters y getters
			this.segundo= segundo; //setSegundo (segundo)

			}
		
			public T getPrimero() {
				return primero;
			}
			public void setPrimero(T primero) {
				this.primero = primero;
				//introducir persona
				//this.primero = "Paco";
			}
			public T getSegundo() {
				return segundo;
			}
			public void setSegundo(T segundo) {
				this.segundo = segundo;
			}
			
			public void Intercambio() {
				
				T temp= primero; //T temp= getPrimero();
				primero=segundo;//setPrimero(getSegundo());
				segundo= temp;	//setSegundo(temp);
				
				//si quiero cambiar el valor de setPrimero
				//setPrimero("Jose")
				
				
				
			}

}
		
