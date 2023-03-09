package principal;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int cantidad=116;
		int tipoMoneda=500;
		while(tipoMoneda>0) {
			int numero = cantidad / tipoMoneda;
			cantidad%=tipoMoneda;
			
			System.out.printf("\n%d de %d", numero, tipoMoneda);
			
			tipoMoneda = switch (tipoMoneda) {
			case 500: {yield 200;}
			case 200: {yield 100;}
			case 100: {yield 50;}
			case 50: {yield 20;}
			case 20: {yield 10;}
			case 10: {yield 5;}
			case 5: {yield 2;}
			case 2: {yield 1;}
			default:
				{yield 0;}
			}; 
			
		}
	}

}
