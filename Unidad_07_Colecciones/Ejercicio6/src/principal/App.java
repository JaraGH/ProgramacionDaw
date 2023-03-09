/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class App {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here

		Scanner entrada = new Scanner(System.in);
		String[] opciones = { "Menú", "1. Nueva publicación", 
				"2. Eliminar publicación", "3. Listar",
				"4. Eliminar varias", "5. Fin", "Elige opción: " };
		Menu menu = new Menu(opciones);

		GestionPublicaciones ap = new GestionPublicaciones();

		for (int i = 1; i <= 5; i++) {
			Publicacion p = generarPublicacion();
			ap.anadirPublicacion(p);
		}

		String opcion = "";
		do {
			opcion = menu.mostrarMenu();
			switch (opcion) {
			case "1":

				Publicacion p = generarPublicacion();
				ap.anadirPublicacion(p);

				break;

			case "2":
				System.out.println("Título de la publicación a eliminar: ");
				String titulo = entrada.nextLine();
				boolean retorno = ap.eliminarPublicacion(titulo);
				if (retorno)
					System.out.println("Eliminado");
				else
					System.out.println("No encontrado");
				break;

			case "3":
				
				ap.listarPublicaciones();
				break;

			case "4":
				System.out.println("Tipo publicación a eliminar? ");
				String tipo = entrada.nextLine();
				int eliminadas = ap.eliminarVarias(tipo);
				System.out.printf("Se han eliminado %d publicaciones.\n", eliminadas);

				break;

			case "5":
				System.out.println("Fin");
				
				break;

			default:
				System.out.println("Error");
			}
			//entrada.nextLine();
		} while (!opcion.equals("5"));

	}

	private static Publicacion generarPublicacion() {
		String[] tipo = { "Deportes", "Naturaleza", "Ajedrez", "Motor", "Caza", "Vuelo" };
		String[] periodicidad = { "Semanal", "Quincenal", "Mensual" };
		String[] editorial = { "Anaya", "SM", "ZRZ", "CAZA", "EDEBE", "SANTILLANA", "CALABAZA" };
		Random rnd = new Random();
		String titulo = "Tit" + rnd.nextInt(5000);
		return new Publicacion(titulo, tipo[rnd.nextInt(tipo.length)], editorial[rnd.nextInt(editorial.length)],
				periodicidad[rnd.nextInt(periodicidad.length)], rnd.nextInt(65000));
	}
}
