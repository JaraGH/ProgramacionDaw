package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Pares  o impares");
		System.out.println("****************");
		
		String respuesta="";
		do {
			System.out.println("\nIntroduce dos valores enteros");

			int n1 = entrada.nextInt();
			int n2 = entrada.nextInt();
			
			if (n1%2==0) {
				System.out.printf("\n%d es par", n1);
			} else { 
				System.out.printf("\n%d es impar", n1);
			}
			
			if (n2%2==0) {
				System.out.printf("\n%d es par", n2);
			} else { 
				System.out.printf("\n%d es impar", n2);
			}

			System.out.println("\nRepetir (S/N)?");
			respuesta = entrada.next();
			
		} while (respuesta.toLowerCase().equals("s"));
				
		
	}

}
