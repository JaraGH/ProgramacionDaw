package clases;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class GestionAlquileres {
	private VehiculoAlquilado [] alquilados = new VehiculoAlquilado[8];

	public GestionAlquileres() {
		alquilados[0] = new VehiculoAlquilado(
				new Cliente(1, "Ana" ,"Robles Paz"), 
				new Vehiculo("1200-BMC", "Seat", "Ibiza",20, true),
				LocalDate.now(), 5);
		alquilados[1] = new VehiculoAlquilado(new Cliente(2, "Luis" ,"Santo Paz"), 
				new Vehiculo("1111-BMC", "Renault", "Clio",25, true),
				LocalDate.now(), 1);
		alquilados[2] = new VehiculoAlquilado(new Cliente(3, "Gema" ,"Díaz Paz"), 
				new Vehiculo("1233-BMC", "Seat", "Ibiza",20, true),
				LocalDate.now(), 9);
		alquilados[3] = new VehiculoAlquilado(new Cliente(4, "Tomás" ,"Sanz Eno"), 
				new Vehiculo("1290-BMC", "Volvo", "XC90", 120, true),
				LocalDate.now(), 11);
		alquilados[4] = new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"), 
				new Vehiculo("9090-BMC", "Volkswagen", "Golf", 34, true),
				LocalDate.now(), 10);
		alquilados[5] = new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"), 
				new Vehiculo("9091-BMC", "Volkswagen", "Passat", 54, true),
				LocalDate.of(2021, 1, 14), 10);
		alquilados[6] = new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"), 
				new Vehiculo("1200-BMC", "Seat", "Ibiza",20, true),
				LocalDate.of(2021, 01, 1), 10);
		alquilados[7] = new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"), 
				new Vehiculo("1200-BMC", "Seat", "Ibiza",20, true),
				LocalDate.of(2022, 01, 1), 10);
	}
	
	public Cliente[] getClienteAlquileres(String matricula) {
		Cliente [] clientes = new Cliente[alquilados.length];
		int indice=0;
		for (VehiculoAlquilado ve: alquilados) {
			if (ve.getVehiculo().getMatricula().equals(matricula)) {
				Cliente clienteActual = ve.getCliente();
				if (!buscarClienteArray(clienteActual.getId(), indice, clientes)) //si dev. false				
					clientes[indice++]=ve.getCliente();
			}
		}
		return Arrays.copyOfRange(clientes, 0, indice);
	}
	
	
	private boolean buscarClienteArray(int idCliente, int indice, Cliente [] clientes) {
		for (int i=0; i<indice;i++) {
			if (clientes[i].getId()==idCliente)
				return true; //encontrado en el array
		}
		return false; //no existe
	}
	
	
	public Cliente getClienteAlquiler(String matricula) {
		
		for (int i = 0; i < alquilados.length; i++) {
			if (alquilados[i].getVehiculo().getMatricula().equalsIgnoreCase(matricula))
				return alquilados[i].getCliente();
		}
		return null;
		
//		for (VehiculoAlquilado vehiculoAlquilado : alquilados) {
//			if (vehiculoAlquilado.getVehiculo().getMatricula().equalsIgnoreCase(matricula))
//				return vehiculoAlquilado.getCliente();
//		}
//		return null;
		
//		return Arrays.stream(alquilados)
//				.filter((a)->(a.getVehiculo().getMatricula().equalsIgnoreCase(matricula)))
//				.map((a)->(a.getCliente()))
////				.findFirst().orElse(null);
	}
	
	public int contarAlquileresCliente(int idCliente) {
		
		int contador=0;
		for (VehiculoAlquilado vehiculoAlquilado : alquilados) {
			if (vehiculoAlquilado.getCliente().getId()==idCliente)
				contador++;
		}
		return contador;
		
//		long contador = Arrays.stream(alquilados)
//				.map((alquiler)->(alquiler.getCliente()))
//				.filter((cliente)->(cliente.getId()==idCliente))
//				.count();
//		return (int) contador;
//				//.collect(Collectors.counting());
	}
	
	public double sumaImporteTodosAlquileres() {
		double suma=0;
		for (VehiculoAlquilado vehiculoAlquilado : alquilados) {
			suma+= vehiculoAlquilado.getImporteAlquiler();
		};
		return suma;
		
//		double suma = Arrays.stream(alquilados)
//				.map((alquiler)->(alquiler.getImporteAlquiler())
//				.collect(Collectors.summingDouble(Double::doubleValue));
//		return suma;
	}

	public void mostrarAlquileresMatricula(String matricula) {
		for (VehiculoAlquilado vehiculoAlquilado : alquilados) {
			if (vehiculoAlquilado.getVehiculo().getMatricula().equalsIgnoreCase(matricula))
				System.out.println(vehiculoAlquilado.toString());
		}
//		Arrays.stream(alquilados)
//			.filter((alquiler)->(alquiler.getVehiculo().getMatricula().equalsIgnoreCase(matricula)))
//			.forEach(System.out::println);
	}
	
}
