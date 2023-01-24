package ejercicio8;

public class Profesor extends Persona{
	private float salario;
	private String fecContratacion;
		
		public Profesor(String codPersona, String nombre,String telContacto, int edad,float salario, String fecContratacion ) {
			super(codPersona, nombre,telContacto,edad);
			setSalario(salario);
			setFecContratacion(fecContratacion);
			
		}

		public float getSalario() {
			return salario;
		}

		public void setSalario(float salario) {
			this.salario = salario;
		}

		public String getFecContratacion() {
			return fecContratacion;
		}

		public void setFecContratacion(String fecContratacion) {
			this.fecContratacion = fecContratacion;
		}
		@Override
		public void mostrar() {
			System.out.println("Profesor: "+ "\nsalario="+ salario + ", fecContratacion=" + fecContratacion);
}
