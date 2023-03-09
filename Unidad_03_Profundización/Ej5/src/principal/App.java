package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tabla multiplicar");
		System.out.println("*****************");
		

		System.out.println("Teclea nº entre 1 y 100");
		int numero = entrada.nextInt();
		
		if (numero>=1 && numero<=100) {
			//hacer la tabla
			// 5 X 1 = 5
			for (int i = 1; i <=10; i++) {
				System.out.println(
						numero 
						+ " X " + i 
						+ " = " + (numero*i));
			}
			
			
		} else {
			System.out.println("Número incorrecto");
		}
		
		
		
		
		
	}

}
