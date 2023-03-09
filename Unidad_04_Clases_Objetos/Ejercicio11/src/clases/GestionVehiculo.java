package clases;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class GestionVehiculo {
	private Vehiculo[] vehiculos = new Vehiculo[100];

	public GestionVehiculo() {
		Random rnd = new Random();
		String [] marcas = {"Seat", "Ford", "Mercedes", "Volkswagen", "Renault", "Fiat"};
		String [][]modelos = {{"Ibiza", "León"}, {"Focus", "Mondeo", "K"}, {"GLA", "GLE", "Clase C"},
				{"Golf", "Polo", "Passat"}, {"Clio", "Megane"}, {"Tipo", "Uno"}};
		for (int i = 0; i < vehiculos.length; i++) {		
			int indiceMarca = rnd.nextInt(marcas.length);
			int indiceModelo = rnd.nextInt(modelos[indiceMarca].length);
			vehiculos[i] = new Vehiculo((1200+i)+"BMC", marcas[indiceMarca]+ "-" + modelos[indiceMarca][indiceModelo], 
					rnd.nextInt(50)+60, 3+5*rnd.nextDouble(), 30 + rnd.nextInt(20));
		}
	}
	
	
	
	public void filtrarPorConsumo(double consumoMax) {
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo!=null && vehiculo.getConsumoMedio()<=consumoMax)
				System.out.println(vehiculo.toString());
		}
	}
	
	public void mostrarTodos() {
		for (int i = 0; i < vehiculos.length; i++) {
			if (vehiculos[i]!=null)
				System.out.println(vehiculos[i].toString());
		}
	}
	
	public double precioMedioAlquiler() {
		double sumaPrecios=0;
		int contadorVehiculo=0;
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo!=null) {
				sumaPrecios+=vehiculo.getPrecioAlquilerDiario();
				contadorVehiculo++;
			}
		}
		return sumaPrecios/contadorVehiculo;
	}
	
	//mostrar los vehiculos cuyo precio de alquiler esta por 
	//debajo del precio medio alquiler.
	public void vehiculosPrecioMedioMenorQueMedia() {
		double precioMedio = precioMedioAlquiler();
		int contador=0;
		for (int i = 0; i < vehiculos.length; i++) {
			if (vehiculos[i]!=null && 
					vehiculos[i].getPrecioAlquilerDiario()<precioMedio) {
				System.out.println(vehiculos[i].toString());
				contador++;
			}
		}
		System.out.println("Se han mostrados " + contador + " veh�culos");
	}
	
	
	
}
