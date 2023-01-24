package ejercicio6_Automovil;

public class Moto extends Automovil {
	
	private int deposito;
	public Moto(int numMarchas, double velocidadMax, int numChasis, int deposito) {
		super(numMarchas, velocidadMax, numChasis);
		setDeposito(deposito);
		
	}
	public int getDeposito() {
		return deposito;
	}
	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}
	@Override
	public String toString() {
		return super.toString()+"\nMoto: deposito=" + deposito;
	}
	
}
