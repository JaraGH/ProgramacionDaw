package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String respuesta;
		do {
			System.out.println("Teclea un número: ");
			int anio = entrada.nextInt();

			if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0)
				System.out.printf("\nEl año %d es bisiesto", anio);
			else
				System.out.printf("\nEl año %d no es bisiesto", anio);
			
			
			System.out.println("\n¿Otra vez (s/n)?");
			respuesta = entrada.next();

		} while (respuesta.equalsIgnoreCase("s"));

	}

}
