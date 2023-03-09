package clases;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Programa [] programas = {
				new Programa ("Windows","7","SO",2007,"Microsoft", "Comercial",90),
				new Programa ("Windows","8","SO",2008,"Microsoft", "Comercial",190)
				};
		 
		GestionPrograma gestion = new GestionPrograma();
		
		String [] opciones = {"Men�",
				"1. Nuevo programa",
				"2. Mostrar lista de software",
				"3. Filtrar por licencia",
				"4. Filtrar por funci�n",
				"5. Eliminar el �ltimo elemento",
				"6. Buscar programa por nombre y retornar programa",
				"7. Salir",
				"Elige opci�n: "};	
		
		Menu menu = new Menu(opciones);
		Random rnd = new Random();
		
		String opcion;
		do {
			opcion = menu.mostrarMenu();
			
			switch (opcion) {
			case "1":
				System.out.println("Nuevo Programa");
				boolean rtdoNuevo = gestion.anadirPrograma(
						new Programa("Pro"+rnd.nextInt(50),
						"11.0", "SO", 1960+rnd.nextInt(60), 
						"Empresa"+rnd.nextInt(6),
						"GPL", 12*rnd.nextInt(10)));
				//rtdo==true
				if (rtdoNuevo) 
					System.out.println("Programa insertado");
				else
					System.out.println("Array lleno");
				break;
			case "2":
				System.out.println("Lista de programas");
				gestion.mostrar();
				break;
			case "3":
				System.out.println("Filtrar por licencia");
				System.out.println("Introduce licencia buscada: ");
				String licencia = entrada.nextLine();  //nextLine()
				gestion.filtrarPorLicencia(licencia);
				break;
			case "4":
				System.out.println("Filtrar por funci�n");
				System.out.println("Introduce funci�n buscada: ");
				String funcion = entrada.nextLine();  //nextLine()
				gestion.filtrarPorFuncion(funcion);
				break;
			case "5":
				System.out.println("Eliminar �ltimo");
				boolean rtdo = gestion.eliminarUltimo();
				if (rtdo)
					System.out.println("�ltimo elemento eliminado");
				else
					System.out.println("Colecci�n vac�a");
				break;				
			case "6":
				System.out.println("Buscar programa por nombre");
				System.out.println("Introduce nombre buscado: ");
				String programaBuscado = entrada.nextLine();
				Programa programa = gestion.buscarPorNombre(programaBuscado);
				if (programa==null)
					System.out.println("No encontrado");
				else
					System.out.println(programa.toString());
				break;
			case "7":
				System.out.println("**FIN**");
				break;
			default:
				System.out.println("***Error***");
				break;
			}
			System.out.println("***************************");
			
		} while (!opcion.equals("7"));
		
		
	}

}
