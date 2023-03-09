package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String respuesta="";
		
		do {
			
			//entrada
			System.out.println("Par o Impar");
			System.out.println("***********");

			System.out.println("Teclea nº entero: ");
			int n = entrada.nextInt();
			
			
			if (n%2==0) {
				System.out.printf("%d es par", n);
			} else {
				System.out.printf("%d es impar", n);
			}
			//pedir si quiere repetir
			System.out.println("\n¿Repetir (S/N)? ");
			respuesta = entrada.next();
			
			
		} while (respuesta.toLowerCase().equals("s"));
		
		
	}

}
