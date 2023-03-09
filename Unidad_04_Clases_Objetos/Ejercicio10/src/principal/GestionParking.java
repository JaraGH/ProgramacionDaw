package principal;

import java.util.Date;

public class GestionParking {

	private Vehiculo [] vehiculos;

	private int plazasLibres;
	private double precioSegundo;
	
	public GestionParking(int capacidadParking, double precioSegundo) {
		this.plazasLibres=capacidadParking;
		this.vehiculos = new Vehiculo[capacidadParking];
		this.precioSegundo=precioSegundo;
	}
	
	
	
	public boolean entradaVehiculo(Vehiculo v) {
		if (plazasLibres>0) {
			//hay plaza libre
			int indiceHuecoLibre = buscarHuecoLibre();
			vehiculos[indiceHuecoLibre] = v;
			//actualizamos plazas libres
			plazasLibres--;
			return true;
		} else {//no hay plaza libre
			return false;
		}
	}
	
	public double salidaVehiculo(String matricula) {
		
		for (int i = 0; i < vehiculos.length; i++) {
			if (vehiculos[i]!=null && vehiculos[i].getMatricula().equalsIgnoreCase(matricula)) {
				Date horaActual = new Date();
				double importe = (horaActual.getTime()-vehiculos[i].getInstanteEntrada().getTime())/1000 * precioSegundo;
				vehiculos[i]=null;
				plazasLibres++;
				return importe;
			}				
		}
		return -1; //no se encontro la matricula
		
	}
	
	private int buscarHuecoLibre() {
		for (int i = 0; i < vehiculos.length; i++) {
			if (vehiculos[i]==null)
				return i;
		}
		return -1; //no hay hueco
	}
	
	public void mostrarPlazasLibres() {
		System.out.println("Plazas libres: " + plazasLibres);
	}
	
	public void mostrarVehiculosParking() {
		
		System.out.println("Vehiculos en el parking");
		System.out.println("***********************");
		for (int i = 0; i < vehiculos.length; i++) {
			if (vehiculos[i]!=null)
				System.out.println(vehiculos[i]);
		}
		
		
	}
	
}
