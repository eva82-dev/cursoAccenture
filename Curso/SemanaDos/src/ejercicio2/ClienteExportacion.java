package ejercicio2;

public class ClienteExportacion extends Cliente{
	private String VAT;
	
	public ClienteExportacion(String nombre, String direccion, 
			String correoElectronico, String VAT){ 
		//si esta vacío, la clase padre tiene que tener un constructor vacío
		//si tiene un parametro, tiene que tener constructor con ese parámetro
		super();
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setCorreoElectronico(correoElectronico);
		this.setVAT(VAT);
		
		
	}

	public String getVAT() {
		return VAT;
	}

	public void setVAT(String vAT) {
		VAT = vAT;
	}


	
}
