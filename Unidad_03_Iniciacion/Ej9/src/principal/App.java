package principal;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuadrado, cubo, cuarta");
		System.out.println("**********************");
		
		System.out.print("Teclea un valor double: ");
		double numero = entrada.nextDouble();
		
		
		double cuadrado = Math.pow(numero,2);		
		double cubo = Math.pow(numero, 3);
		double cuarta = Math.pow(numero, 4);
		
		System.out.printf("Número: %f \nSu cuadrado: %f \nSu cubo: %f \nElevado a 4: %f", 
				numero, cuadrado, cubo, cuarta);
		

		
		
	}

}
