package ejercicio6_Automovil;

import java.util.ArrayList;
import java.util.List;

public class UsoAutomovil {
	

	public static void main(String[] args) {
		Coche coche =new Coche(7, 60, 7770, 70);
		Coche coche1 =new Coche(6, 555550, 760, 70);
		Moto moto = new Moto(80, 770, 880, 90);
		Camion camion= new Camion(99, 06, 60, 660, 60);
		
		List<Automovil>datos = new ArrayList<Automovil>();	//distinto tipo que se almacenan en Equipo
		datos.add(coche);
		datos.add(moto);
		datos.add(camion);
		
		coche.setNumPuertas(5);
		System.out.println(coche.toString());
		System.out.println("---------------");
		
		System.out.println(coche1.toString());
		System.out.println("---------------");
		System.out.println(moto.toString());
		System.out.println("---------------");
		System.out.println(camion.toString());
		
		//interface
		coche.activarReductora(false);
		coche1.activarReductora(true);
		
		
		
}	
}
