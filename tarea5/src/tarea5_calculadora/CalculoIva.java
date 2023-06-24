package tarea5_calculadora;

public class CalculoIva {

	
	private double deducion;
	
	public SueldoNeto() {
	}
	
	public void setdeducion(double deducion){
		this.deducion = deducion;
	}
	
	
	public double calcNeto() {
		if(deducion <= 50) {
			return deducion *1.05;
	}else {
		return deducion*1.1;
	}

}
}