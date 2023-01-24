package ejercicio3_Agroalimentaria;

public class Frescos extends Productos{
	private String fechaEnvasado= "12/02/2023";                                         //¿porque se cargan las variables?
	private String PaisOrigen= "España";  <------------variables empiezan con minusculas//
	
	
	public Frescos(String fechaEnvasado, String PaisOrigen, String fechaCaducidad, String numLote ){ 
		super(fechaCaducidad,numLote );
		this.setFechaEnvasado(fechaEnvasado);
		this.setPaisOrigen(PaisOrigen);		
		
	}
	
	public Frescos() {
		
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return PaisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		PaisOrigen = paisOrigen;
	}
	@Override
	public String toString() {		<--------Solo deberia imprimir sus datos.....
		return "Frescos = "+ "\nfecha de Caducidad=" + fechaCaducidad +"\tnum de Lote= "+ numLote+ " \tfecha de Envasado= " + fechaEnvasado + "\tPais de Origen=" + PaisOrigen;
	}
	
	
}
