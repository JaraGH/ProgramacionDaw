package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		
		System.out.printf("Número perfecto");
		
		System.out.println("Teclea un número:");
		int n=entrada.nextInt();
		
		int sumaDivisores=0;
		for (int i = 1; i <=(n/2); i++) {
			
			if (n%i==0) {				
				sumaDivisores+=i;
			}
		}
		
		if (n==sumaDivisores) {
			System.out.printf("\n%d es perfecto", n);
		} else {
			System.out.printf("\n%d no es perfecto", n);
		}
	}

}
