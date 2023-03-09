package clases;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestionAlquileres gestion = new GestionAlquileres();
	
		
		for (Cliente cli: gestion.getClienteAlquileres("1200-BMC")) {
			System.out.println(cli.toString());
		}
		
//		Cliente cliente = gestion.getClienteAlquiler("1111-BMC");
//		
//		if (cliente!=null)
//			System.out.println("Cliente: " + cliente.toString());
//		else
//			System.out.println("Nadie lo alquiló");
////		
//		int contador = gestion.contarAlquileresCliente(5000);
//		System.out.printf("Eva alquilo %d vehículos.", contador);
//		
		
//		gestion.mostrarAlquileresMatricula("1200-BMC");
		
		
//		Cliente cliente = gestion.getClienteAlquiler("3331200-BMC");
//		System.out.println(cliente);
		
//		int c = gestion.contarAlquileresCliente(5000);
//		System.out.println(c);
		
//		double sumaI = gestion.sumaImporteTodosAlquileres();
//		System.out.println(sumaI);
//		
		//gestion.mostrarAlquileresMatricula("1200-BMC");
		
	}

	
}
