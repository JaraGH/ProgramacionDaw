package principal;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("De pulgadas a cm y m");
		System.out.println("********************");
		
		System.out.println("Teclea un valor en pulgadas: ");
		double pulgadas = entrada.nextDouble();
		
		double cm = pulgadas * 2.54;
		double m = cm / 100;
		
		System.out.println("Pulgadas ---> " + pulgadas);
		System.out.println("A centímetros --> " + cm);
		System.out.println("A metros --> " + m);
		

		
		
	}

}
