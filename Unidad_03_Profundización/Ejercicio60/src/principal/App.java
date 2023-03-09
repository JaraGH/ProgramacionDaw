package principal;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		for (int numero = 1; numero <= 10000; numero++) {

			boolean primo = true; // true es primo. false no primo

			for (int i = 2; i <= numero / 2 && primo == true; i++) {
				if (numero % i == 0)
					primo = false;
			}
			if (numero > 1 && primo == true) // es equivalente, --> if (primo)
				System.out.println(numero + " es primo");

		}

	}

}
