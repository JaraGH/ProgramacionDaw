package clases;

import java.text.DecimalFormat;

public class Vehiculo {
	//matr�cula, marca, modelo, potencia, consumo medio y precio de alquiler diarioijj
	private String matricula;
	private String marca;
	private int potencia;
	private double consumoMedio;
	private double precioAlquilerDiario;
	
	public Vehiculo(String matricula, String marca, int potencia, double consumoMedio, double precioAlquilerDiario) {
		this.matricula = matricula;
		this.marca = marca;
		this.potencia = potencia;
		this.consumoMedio = consumoMedio;
		this.precioAlquilerDiario = precioAlquilerDiario;
	}
	
	

	public Vehiculo(String matricula, double precioAlquilerDiario) {
		this.matricula = matricula;
		this.precioAlquilerDiario = precioAlquilerDiario;
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

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getConsumoMedio() {
		return consumoMedio;
	}

	public void setConsumoMedio(double consumoMedio) {
		this.consumoMedio = consumoMedio;
	}

	public double getPrecioAlquilerDiario() {
		return precioAlquilerDiario;
	}

	public void setPrecioAlquilerDiario(double precioAlquilerDiario) {
		this.precioAlquilerDiario = precioAlquilerDiario;
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("##.###");
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", potencia=" + potencia + ", consumoMedio="
				+ formato.format(consumoMedio) + ", precioAlquilerDiario=" + precioAlquilerDiario + "]";
	}
	
	
}
