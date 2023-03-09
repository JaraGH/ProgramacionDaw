package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String respuesta="";		
		do {
			
			//entrada
			System.out.println("Cáculo del IMC");
			System.out.println("\nTeclea altura en metros y peso en kilos...");
			double altura = entrada.nextDouble();
			double peso = entrada.nextDouble();
			
			//proceso
			double imc = peso / Math.pow(altura, 2);
			
			//salida
			System.out.println("Su IMC es: " + imc);
			
			//pedir si quiere repetir
			System.out.println("¿Repetir (S/N)? ");
			respuesta = entrada.next();
						
		} while (respuesta.toLowerCase().equals("s"));
		
		
	}

}
