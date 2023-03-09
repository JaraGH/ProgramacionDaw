package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 5; i <=25; i++) {
			
			System.out.printf("\nNúmero: %2.3f\t"
					+ "Cuadrado: %2.3f\t"
					+ "Cubo: %2.3f", 
					(double)i, Math.pow(i, 2) , Math.pow(i, 3));
		}
		
		
	}

}
