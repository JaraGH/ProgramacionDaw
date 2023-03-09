package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
        String [] opciones = {"Menú", "1. Entrada vehículo", "2. Salida vehículo", 
            "3. Mostrar vehículos en parking", "4. Fin"};
        Menu menu = new Menu (opciones);
        
        GestionParking park = new GestionParking(5, 0.015);
        
        
        String opcion="";
        do {
            String matricula="";
            opcion = menu.mostrarMenu();
            switch (opcion) {
                case "1":
                    System.out.println("Matrícula?");
                    matricula = entrada.next();
                    boolean valor=park.entradaVehiculo(new Vehiculo(matricula));
                    if (valor)
                        System.out.println("Insertado correctamente");
                    else
                        System.out.println("Parking lleno");
                    
                    break;
                case "2":
                    System.out.println("Matrícula?");
                    matricula = entrada.next();
                    double importe=park.salidaVehiculo(matricula);
                    if (importe==-1)
                        System.out.println("Matrícula inexistente");
                    else{
                        System.out.println("**Salida de vehículo**");
                        System.out.println("Matrícula: " + matricula);
                        System.out.println("Importe: " + importe);
                    }
                case "3":
                    park.mostrarVehiculosParking();
                    break;
                case "4":
                    System.out.println("Fin");
                    break;
                default:
                    System.out.println("Error en la opción");
            }
            entrada.nextLine();
        }while (!opcion.equals("4"));
	}

}
