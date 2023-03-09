package principal;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Horas, minutos y segundos");
		System.out.println("*************************");
		
		System.out.print("Teclea un valor en segundos: ");
		
		int tiempoSegundos = entrada.nextInt(); //3661
		
		int horas = tiempoSegundos/3600;
		int segundosRestantes = tiempoSegundos % 3600;
		
		int minutos = segundosRestantes / 60;
		int segundos = segundosRestantes % 60;
		
		// %s para texto
		// %d para enteros
		// %f para reales (float y double)
		// %b para booleans
		
		System.out.printf("%d segundos son %d horas %d minutos %d segundos", 
				tiempoSegundos, horas, minutos, segundos);		

		
		
	}

}
