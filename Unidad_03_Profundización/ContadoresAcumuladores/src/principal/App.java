package principal;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		//genera 100 numeros y cuenta cuantos son > 500
		
		Random azar = new Random();
		
		int contador=0;
		int acumuladorMay500 =0;
		for (int i = 0; i < 100; i++) {
			
			int numeroGenerado = azar.nextInt(1000); //gene 0 y 999
			
			System.out.println(numeroGenerado);
			
			if (numeroGenerado>500) {
				contador++;
				acumuladorMay500+=numeroGenerado;
			}
			
		}
		
		System.out.println("Mayores de 500:  " + contador);
		System.out.println("Suma de los mayores de 500:  " + acumuladorMay500);
		
	}

}
