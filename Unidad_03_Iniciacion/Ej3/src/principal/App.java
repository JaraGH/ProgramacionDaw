package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Perímetro del rectángulo");
		
		System.out.println("¿Base? "); 
		double base = entrada.nextDouble();
		
		System.out.println("¿Altura? "); 
		double altura = entrada.nextDouble();
		
		double perimetro = 2*base + 2*altura;

		
		System.out.println("El perímetro es: " + perimetro);

	}

}
