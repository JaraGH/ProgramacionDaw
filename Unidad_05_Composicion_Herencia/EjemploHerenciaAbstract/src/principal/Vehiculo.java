package principal;

public abstract class  Vehiculo {

	private String matricula;
	private String marca;
	private String modelo;
	private double tarifa;
	public Vehiculo(String matricula, String marca, String modelo, double tarifa) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tarifa = tarifa;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	public  abstract String  getDatos();
	
//	@Override
//	public String toString() {
//		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", tarifa=" + tarifa
//				+ "]";
//	}
	
	
}
