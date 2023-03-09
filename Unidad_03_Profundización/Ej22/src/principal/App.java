package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Teclea números. 0 -> Fin");
		
		int cuenta=0;
		int suma=0;
		int numero;
		do {
			
			System.out.print("Número ? "); 
			numero=entrada.nextInt();
			
			cuenta++;
			suma+=numero;
			
		} while (numero!=0);
		
		
		System.out.printf("Números tecleados: %d \n"
				+ "Suma: %d", cuenta, suma);
		
		
		
		
	}

}
