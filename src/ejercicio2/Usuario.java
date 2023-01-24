package ejercicio2;

public class Usuario extends Persona {

	private int codigoUsuario;

	
	public  Usuario(int codigoUsuario) {
		super();
		this.codigoUsuario= codigoUsuario;
		
}


	public int getCodigoUsuario() {
		return codigoUsuario;
	}


	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public void autorizar() {
		System.out.println("autorizado");
	}
	public void crear() {
		System.out.println("creado");
		
	}
	
	//implemento abstract
	@Override
	public String aString() {
		return "Cliente" + getCodigoUsuario();
	}
}
