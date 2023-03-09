package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Muestra números de 1 a 99 y su suma...\n\n");
		int suma=0;
		for (int i = 1; i <=99; i+=2) {
			suma+=i;
			System.out.println(i);		
		}
		
		System.out.println("Suma: " + suma);
		
		
		
	}

}
