package curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EjemploColecciones {

	public static void main(String[] args) {
		List<String>nombres= new ArrayList<String>();
		nombres.add("María");
		nombres.add("Pedro");
		nombres.add("Pepa");
		nombres.add("Jose");
		nombres.add("Isabel");
		for (String dato:nombres) {//lo recorro
		System.out.println(dato);//lo imprimo
		
		//me busca un elemento
		if(nombres.contains("Pepa"))
			System.out.println("contiene Pepa");
			System.out.println(nombres.indexOf("Pepa"));
		
		//otra forma de rellenar el arraylist
		List<String>lista= new ArrayList<String>();
		String[]nombre = {"Jose","Lola","Irene","Rufi","Pedro"};
		lista.addAll(Arrays.asList(nombre));
	
		//iterator (otra forma de imprimirlo)
		for(Iterator<String>it=nombres.iterator();it.hasNext();){
		System.out.println(it.next());
		
		}
	}
	}
}
