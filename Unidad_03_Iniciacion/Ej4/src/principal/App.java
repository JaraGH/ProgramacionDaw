package principal;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calcula la edad");
		
		System.out.println("Teclea nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.println("Año de nacimiento?");
		int anio = entrada.nextInt();
		
		//LocalDate guarda datos de tipo fecha
		//el método getYear() retorna/devuelve el año de esa fecha
		LocalDate fechaActual = LocalDate.now();		
		int edad = fechaActual.getYear() - anio;
		
		//De esta forma, la App solo funciona para el año 2022
		//int edad = 2022 - anio;
		
		System.out.println(nombre + ", tienes " + edad + " años."); 

	}

}
