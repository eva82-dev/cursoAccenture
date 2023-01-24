package ejercicio3_Agroalimentaria;

public class Congelados extends Productos {
	//public abstract class Congeldor extends Productos
	private int tempCongelacion= 60;
	
	public Congelados(int tempCongelacion,String fechaCaducidad, String numLote ) {
		super(numLote, fechaCaducidad);
		this.setTempCongelacion(tempCongelacion);
	
	}

	public Congelados() {
		
	}

	public int getTempCongelacion() {
		return tempCongelacion;
	}

	public void setTempCongelacion(int tempCongelacion) {
		this.tempCongelacion = tempCongelacion;
		
	}

	@Override
	public String toString() {
		return "Congelados = "+ "\nfecha de Caducidad=" + fechaCaducidad +"\tnum de Lote= "+ numLote+ "\tTemperatura de Congelacion=" + tempCongelacion;
	}

}
