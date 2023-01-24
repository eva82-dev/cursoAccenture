package ejercicio2;

public class Cliente extends Persona { //extiende
	private int numeroCliente;
	private String fechaAlta;
	
	public Cliente(String nombre, String direccion, String correoElectronico,String fechaAlta){ 
		super(nombre);
		this.setNombre(nombre);
		this.setCorreoElectronico(fechaAlta);
		this.fechaAlta= fechaAlta;	
		Funciones.grabar(this);
		
		}
	
	public Cliente() {
		
	}



	//apartir de ahora setNombre es este
	@Override
	public void setNombre(String nombre) {
		if(filtrarNombre(nombre)) {
			super.setNombre(nombre);//uso el método padre
		}else {
			System.out.println("error");
		}
		
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	public void verFechaAlta() {
		System.out.println("fecha");
	}
	@Override
	public String aString() {
		return "Cliente" + getNumeroCliente()+ getFechaAlta();
		/*
		 * si no utilizara abstract:
		 * 
		 * @Override
		*	public String aString() {
		*		Strind salida= super.aString();//super: ejecutar algo del padre
		*		return "cliente" + getNumeroCliente + getAltaFecha
		*}
		*/
		
	}
	@Override
	public void crear() { //utilizo un método de la clase Persona y lo sobreescribo
		Persona p1= new Cliente();
		System.out.println("Cliente salvado");
	}
	
	//para grabar Clientes y Usuarios
	public void grabar(Persona per) { //puedo acceder a todos los métodos de Persona
		per.aString();
		if (per instanceof Cliente) { //si per es un Cliente, créalo
		Cliente ss = (Cliente)per;//cast para poder acceder al método
									//lo convierto a Persona
		ss.aString();				//uso el método
		
		//Object ff= (Object)ss;//no usar porque es demasiado generalizao y 
								//me pueden meter cualquier cosa sin que Eclipse me de error
		}
		if (per instanceof Usuario) {//el Usuario pero pertener a persona porque la clase 
										//extiende de Persona
			Usuario ss = (Usuario)per;//cast para poder acceder al método
			ss.aString();
			
			}
	}
	public boolean filtrarNombre(String nombre) {
		if(nombre.length()>20&& nombre.length()<=50);
		return true;
	}
}
