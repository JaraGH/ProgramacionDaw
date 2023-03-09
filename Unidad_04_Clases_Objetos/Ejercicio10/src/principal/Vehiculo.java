package principal;

import java.util.Date;

public class Vehiculo {
	private String matricula;
	private Date instanteEntrada;
	
	public Vehiculo(String matricula) {
		this.matricula = matricula;
		this.instanteEntrada = new Date();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getInstanteEntrada() {
		return instanteEntrada;
	}

	public void setInstanteEntrada(Date instanteEntrada) {
		this.instanteEntrada = instanteEntrada;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", instanteEntrada=" + instanteEntrada + "]";
	}
	
	
	
	
}
