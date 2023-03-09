package principal;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int filas=8;
		
		for (int i = 1; i <=filas; i++) {
			for (int j = 1; j <=i; j++) {
				if (i==1 || i==filas)
					System.out.print("*");
				else if (j==1 || j==i)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
						
		
	}

}
