package principal;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VehiculoAlquilado ve = new VehiculoAlquilado(
				new Cliente(1,  "Ana"), 
				new Vehiculo("1234-MLD", "Seat", "Ibiza", 50.5), 
				LocalDate.of(2023, 01,23),
				5);
		
		Cliente cli = ve.getCliente();
		Vehiculo v = ve.getVehiculo();
		String nombreCliente = ve.getCliente().getNombre();
		
	}

}
