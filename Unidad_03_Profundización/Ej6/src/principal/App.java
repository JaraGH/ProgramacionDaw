package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Teclea un nº entero positivo: ");
		int n = entrada.nextInt();
		
		if (n>=0) {
			for (int i = n; i>=1; i--) {
				System.out.println(i + " ");
			}
		} else {
			
			System.out.println("Error en el nº");
		}
		
		
		
		
	}

}
