package principal;


import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nombre y edad");
		System.out.println("*************");
		
		System.out.print("Teclea nombre y edad ");
		
		String nombre = entrada.nextLine();
		int edad = entrada.nextInt();
		
		if (edad<18) {
			System.out.printf("%s tienes %d años, eres menor de edad", nombre,edad);
		} else if (edad >=18 && edad<=65) {
			System.out.printf("%s tienes %d años, eres adulto", nombre,edad);
		} else {
			System.out.printf("%s tienes %d años, eres mayor", nombre,edad);
		}
	
		
	}

}
