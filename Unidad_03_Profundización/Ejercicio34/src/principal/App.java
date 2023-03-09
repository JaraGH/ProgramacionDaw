package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String respuesta;
		do {
			char caracter = entrada.next().charAt(0);
			int codigoAscii=caracter;
			
			System.out.printf("El caracter %c tiene el código %d", caracter, codigoAscii);
			
			
			if (codigoAscii>=65 && codigoAscii<=90)
				System.out.println("\nEl caracter es una mayúscula");
			else if (codigoAscii>=97 && codigoAscii<=122)
				System.out.println("\nEl caracter es una minúscula");
			else if (codigoAscii>=48 && codigoAscii<=57)
				System.out.println("\nEl caracter es un dígito");
			else
				System.out.println("\nNo es ni letra ni dígito");
			
			System.out.println("Otra vez?");
			respuesta=entrada.next();
			
		} while (respuesta.equalsIgnoreCase("s"));
	}

}
