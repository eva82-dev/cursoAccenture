package ejercicio2;

public class Administrador implements Cosas{
	private int codAdm;

	public int getCodAdm() {
		return codAdm;
		//Funciones.grabar(this);
	}

	public void setCodAdm(int codAdm) {
		this.codAdm = codAdm;
	}
	
	@Override
	public String aString() {
		return " ";
	}
	
}

