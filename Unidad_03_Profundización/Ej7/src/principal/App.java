package principal;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Teclea un nº entero positivo: ");
		int n = entrada.nextInt();
		
		if (n>=0) {		
			for (int i=1;i<=n;i++) {
				System.out.println("**********");
			}
		} else {
			System.out.println("Error, el número debe ser positivo");
		}
		
		
		
		
		
	}

}
