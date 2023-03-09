package principal;

import java.util.Iterator;
import java.util.Random;

public class App {

	public static void main(String[] args) {

		muestraGemelosEntre(1,100);

	}

	static void muestraGemelosEntre(int inicio, int fin) {
		if (fin<inicio) {
			int aux=inicio;
			inicio=fin;
			fin=aux;
		}
		for (int i = inicio; i <=fin; i++) {
			if (esPrimo(i)) {
				if (esPrimo(i+2))
					System.out.printf("\n%d y %d son primos gemelos", i, (i+2));
			}
		}
	}
	
	static boolean esPrimo(int numero) {
		for (int i = 2; i <=numero/2; i++) {
			if (numero%i==0) 
				return false;
		}
		return true;
	}
}
