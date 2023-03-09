package principal;

public class Deportivo extends Vehiculo{
	
	private int puertas;

	public Deportivo(String matricula, String marca, String modelo, double tarifa, int puertas) {
		super(matricula, marca, modelo, tarifa);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return super.toString() + " Deportivo [puertas=" + puertas + "]";
	}
	
	
	
	

}
