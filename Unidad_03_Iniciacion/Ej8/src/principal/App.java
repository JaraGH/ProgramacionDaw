package principal;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("La media de 3 valores");
		System.out.println("*********************");
		
		System.out.println("Teclea tres valores doubles...");
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		double c = entrada.nextDouble();
		
		double media = (a+b+c)/3;
		
		System.out.printf("La media de los valores es %.2f"
				,media);
		

		
		
	}

}
