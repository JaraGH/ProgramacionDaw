package principal;

import java.time.LocalDate;

public class VehiculoAlquilado {

	private Cliente cliente;
	private Vehiculo vehiculo;
	private LocalDate fechaAlquiler;
	private int dias;
	public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, LocalDate fechaAlquiler, int dias) {
		super();
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.fechaAlquiler = fechaAlquiler;
		this.dias = dias;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}
	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	@Override
	public String toString() {
		return "VehiculoAlquilado [cliente=" + cliente + ", vehiculo=" + vehiculo + ", fechaAlquiler=" + fechaAlquiler
				+ ", dias=" + dias + "]";
	}
	
	
	
}
