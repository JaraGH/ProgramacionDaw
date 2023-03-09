package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Sumar números desde 1 a nº");
		int numero= entrada.nextInt();
		
		if (numero<0) {
			System.out.println("Error, el nº debe ser positivo");			
		} else {
			int suma=0;
			for (int i = 1; i <=numero; i++) {
				suma+=i;
			}
			System.out.printf("La suma de los números "
					+ "de 1 a %d es %d", numero, suma);
		}
		
		
		
		
		
		
		
		
	}

}
