package ejercicio5_Equipo;

import java.util.ArrayList;
import java.util.List;

public class UsoFutbolistaMain {
	
	public static void main(String[] args) {
	Entrenador entrenador =new Entrenador(3, "Jose", "Perez", 7, "no sé");
	Futbolista futbolista = new Futbolista (5, "Maria", "López", 9, 0, "hhhh");
	Masajista masajista= new Masajista (7, "Pepe", "García", 0, 0, "jjjj");
	
	List<Equipo>datos = new ArrayList<Equipo>();	//distinto tipo que se almacenan en Equipo
	datos.add(entrenador);
	datos.add(masajista);
	datos.add(futbolista);
	System.out.println(datos);
	
	/*
	lista2.forEach((actual) ->{
	if(actual!= null) {
		
		actual.concentrarse();
		actual.viajar();
		if (actual instanceof Futbolista) {
			((Futbolista)actual).entrenar();
		}
		if (actual instanceof Entrenador) {
			((Entrenador)actual).dirigir()
			((Entrenador)actual).dirigirEntrenamiento();
		}
		if(actual instanceof Masajista) {
			((Masajista)actual).darMasajes();
		}*/
	
	}
}