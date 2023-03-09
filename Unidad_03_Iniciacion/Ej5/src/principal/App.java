package principal;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calcula la edad");
		
		System.out.println("Teclea nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Peso en kg: "); 
		double peso = entrada.nextDouble();
		System.out.print("Altura en metros: "); 
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura*altura);
		//double imc = peso / Math.pow(altura, 2);
		System.out.println("Tu edad: " + imc); 

	}

}
