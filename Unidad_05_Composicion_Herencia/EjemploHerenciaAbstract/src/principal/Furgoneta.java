package principal;

public class Furgoneta extends Vehiculo {

	private double capacidad;
	private double volumen;
	
	public Furgoneta(String matricula, String marca, String modelo, double tarifa, double capacidad, double volumen) {
		super(matricula, marca, modelo, tarifa);
		this.capacidad = capacidad;
		this.volumen = volumen;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	@Override
	public String toString() {
		return super.toString() +" Furgoneta [capacidad=" + capacidad + ", volumen=" + volumen + "]";
	}

	@Override
	public String getDatos() {
		// TODO Auto-generated method stub
		return super.getMatricula() + "-" + super.getMarca() + "-" + this.volumen;
	}
	
	
	
}
