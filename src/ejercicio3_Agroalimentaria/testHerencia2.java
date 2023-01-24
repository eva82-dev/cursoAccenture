package ejercicio3_Agroalimentaria;

public class testHerencia2 {

	public static void main(String[] args) {
		Congelados congelado = new Congelados();
		
		Productos producto = new Productos();
		Frescos frescos = new Frescos();
		Congelados aire = new Congelados();
		Refrigerados refi = new Refrigerados();
		CongeladosAgua agua= new CongeladosAgua();
		CongeladosNitrogeno nito = new CongeladosNitrogeno();
		CongeladosAire air = new CongeladosAire();
		
		
		
		
		System.out.println(producto.toString());
		System.out.println("--------");
		System.out.println(refi.toString());
		System.out.println("--------");
		System.out.println(frescos.toString());
		System.out.println("--------");
		System.out.println(aire.toString());
		System.out.println("--------");
		System.out.println(agua.toString());
		System.out.println();
		System.out.println(nito.toString());
		System.out.println();
		System.out.println(air.toString());
		
		/*List<Productos> lista = new Arraylist<Productos>();
		lista.add(new Refri(hoy,123,100);)
		
		Productos nombrequeyoquiera= new Refri (hoy,123,100);
		list.forEach((pr) )-> System.out.println(pr.toString);//guardo los datos en pr y los imprimo
		*/
	}

}

produ