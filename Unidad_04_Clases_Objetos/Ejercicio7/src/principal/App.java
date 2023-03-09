package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

				

		Scanner entrada = new Scanner(System.in);
		
		GestionDvd gestion = new GestionDvd();
		
		String [] opciones = {"Menú de opciones", 
				"1. Mostrar la lista de películas (Título y productora)",
				"2. Mostrar la película de más duración (Título y minutos)",
				"3. Pedir un género y mostrar el título de las pelis de ese género",
				"4. Duración de la peli...",
				"5. Fin",
				"Elige opción: "};	
		
		Menu menu = new Menu(opciones);
		
		String opcion;
		do {
			opcion = menu.mostrarMenu();
			
			switch (opcion) {
			case "1":
				System.out.println("Mostrar pelis");
				gestion.mostrarPelis();
				break;
			case "2":
				System.out.println("Peli más larga");
				DvdCine masLarga = gestion.buscarPeliMasLarga();
				System.out.println(masLarga.getTitulo() + "-" + 
						masLarga.getDuracion());
				break;
			case "3":
				System.out.println("Filtrar por género");
				System.out.println("Introduce género buscado: ");
				String generoBuscado = entrada.nextLine();  //nextLine()
				gestion.filtrarPorGenero(generoBuscado);
				break;
			case "4":
				System.out.println("Introduce título: ");
				String tituloBuscado = entrada.nextLine();
				int duracion = gestion.duracionPeli(tituloBuscado);
				if (duracion!=-1)
					System.out.printf("La duración de '%s' es %d minutos\n", tituloBuscado , duracion);
				else
					System.out.printf("Peli %s no encontrada\n", tituloBuscado);
				break;
			case "5":
				System.out.println("**FIN**");
				break;				
			default:
				System.out.println("***Error***");
				break;
			}
			System.out.println("***************************");
			
		} while (!opcion.equals("5"));
		

	}

}
