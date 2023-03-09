package principal;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int filas=4;
		int blancos = filas-1;
		for (int i = 1; i<=filas; i++) {	
			
			//int blancos = filas-i;
			for (int j=1;j<=blancos; j++) {
				System.out.print(" ");
			}
			blancos--;
			
			
			for (int j = 1; j<=filas; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}

}
