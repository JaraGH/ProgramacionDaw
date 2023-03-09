package principal;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int numero=6;
		
		for (int i=1;i<=6;i++) {
			System.out.print(i + "-->");
			
			int numeroAsteriscos = (int) Math.pow(2,i);
			
			for (int j=1;j<=numeroAsteriscos;j++) {				
				System.out.print("*");	
			}
			
			System.out.println();
		}
		
		
		
	}

}
