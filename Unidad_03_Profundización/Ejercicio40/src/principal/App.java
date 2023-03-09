package principal;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int numero=6;
		
		for (int i=1;i<=6;i++) {
			System.out.print(i + "-->");
			for (int j=1;j<=i;j++) {				
				System.out.print("*");	
			}
			System.out.println();
		}
		
		
		
	}

}
