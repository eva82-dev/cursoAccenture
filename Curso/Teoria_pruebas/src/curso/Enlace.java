package curso;

import java.time.LocalTime;

public class Enlace {
	
	//instanciamos la clase
	public String url;
	public LocalTime hora;
	public int indice;
	static int contador= 0;
	
	Enlace(){
		indice=contador++;
	}
	public void modificacion () {
	Definiciones defin = new Definiciones();
	Definiciones defin2 = new Definiciones();
		
	defin.nombre= "esto es defi";
	defin2.nombre= "esto es defi2";
	
	System.out.println("defi="+ defin.nombre);
	System.out.println("defi2="+ defin2.nombre);
	
	defin.descripcion= "1";
	Definiciones.descripcion= "2";
	defin2.descripcion= "3";
	
	System.out.println("defi="+ defin.descripcion);
	System.out.println("defi2="+ defin2.descripcion);

	System.out.println(this);
	}
	@Override
	public String toString() {
		return "Enlace [url=" + url + ", hora=" + hora + ", indice=" + indice + "]";
	}
	

}
