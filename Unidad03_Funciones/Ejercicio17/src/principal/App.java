package principal;

import java.util.Iterator;
import java.util.Random;

public class App {

	public static void main(String[] args) {

		System.out.printf("\nCadena: %s, Centro: %s", "hola", getCentroCadena("hola"));
		System.out.printf("\nCadena: %s, Centro: %s", "hoala", getCentroCadena("hoala"));
	}

	static String getCentroCadena(String cadena) {
		//LONGITUD PAR
		if (cadena.length()%2==0) {
			int mitad=cadena.length()/2-1;
			return cadena.substring(mitad,mitad+2);
		} else {
			//LONGITUD IMPAR
			int mitad=cadena.length()/2;
			return cadena.substring(mitad,mitad+1);
		}
	}
	
	
	
}
