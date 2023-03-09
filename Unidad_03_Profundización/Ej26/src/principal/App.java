package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Suma de los divisores de un número");

		System.out.println("\nNumero? ");
		int numero = entrada.nextInt();

		int suma = 0;
		for (int i = 1; i <= numero / 2; i++) {
			if (numero % i == 0)
				suma += i;
		}

		System.out.printf("La suma de los divisores de %d es %d", numero, suma);

	}

}
