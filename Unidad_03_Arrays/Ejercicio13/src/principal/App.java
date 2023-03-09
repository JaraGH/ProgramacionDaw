package principal;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String [] dias = {"lunes", "martes", "miércoles", "jueves"
				, "viernes", "sábado", "domingo"};
		
		System.out.print("Introduce nº día de la semana: ");
		
		int dia = entrada.nextInt();
		
		if (dia>=1 && dia<=7)
			System.out.println("Ese día es " + dias[dia-1]);
		else
			System.out.println("Error, debes teclear un valor entre 1 y 7");
		
	}
	
		
}
