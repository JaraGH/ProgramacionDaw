package principal;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int filas=5;
		
		int asteriscosUltimaFila = (int) Math.pow(2, filas);
		
		for (int i = 1; i <=filas; i++) {
			int asteriscosFila = (int) Math.pow(2, i);
			
			int blancosFilas = (asteriscosUltimaFila - asteriscosFila)/2;
			
			for (int j = 1; j <=blancosFilas; j++) {
				System.out.print(" ");	
			}			
			
			for (int j = 1; j <=asteriscosFila; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
