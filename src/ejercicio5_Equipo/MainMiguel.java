package ejercicio5_Equipo;

public class MainMiguel {

	public static void main(String[] args) {
		Equipo[]lista= new Equipo[10];
		
		lista[0]= new Futbolista(1,"Miguel",null,20,7,null);
		lista[1]= new Entrenador(0, "pepe", null, 0, null);
		
		for (Equipo actual:lista) {
			if(actual!= null) {
			
				actual.concentrarse();
				actual.viajar();
				if (actual instanceof Futbolista) {
					((Futbolista)actual).entrenar();
				}
				if (actual instanceof Entrenador) {
					((Entrenador)actual).dirigir();
					((Entrenador)actual).dirigirEntrenamiento();
				}
				if(actual instanceof Masajista) {
					((Masajista)actual).darMasajes();
				}
			}
			
			
		}

	}

}

	