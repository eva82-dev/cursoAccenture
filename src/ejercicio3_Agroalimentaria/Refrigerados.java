package ejercicio3_Agroalimentaria;

public class Refrigerados extends Productos {
	
	private int codOrganismos;
	
	//constructor con parámetros
	public Refrigerados (int codOrganismos, String fechaCaducidad, String numLote) {
		super(fechaCaducidad, numLote);//atributos de la clase padre
		this.setCodOrganismos(codOrganismos); //atributo de la clase hija
		
	}
	
	//constructos vacío
	public Refrigerados() {
		
	}

	//getters y setters
	public int getCodOrganismos() {
		return codOrganismos;
	}

	public void setCodOrganismos(int codOrganismos) {
		this.codOrganismos = codOrganismos;
	}


	/*método toString()
	 * añado primero los atributos de la clase padre y después la clase hija
	 */
	@Override
	public String toString() {
		return "Refrigerados= "+ "\nfecha de Caducidad=" + fechaCaducidad +"\tnum de Lote= "+ numLote+  
				"\t codigo de los organismos =" + codOrganismos;
		
		"" +super.toString()
		}

}
