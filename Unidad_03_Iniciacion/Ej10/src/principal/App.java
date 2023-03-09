package principal;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Hacer un casting");
		System.out.println("****************");
		
		System.out.print("Teclea un valor double: ");
		double numeroDouble = entrada.nextDouble();
		
		//casting
		int numeroEntero =  (int) numeroDouble;
		
		System.out.println("Nº double: " + numeroDouble);
		System.out.println("Nº entero: " + numeroEntero);
		

		
		
	}

}
