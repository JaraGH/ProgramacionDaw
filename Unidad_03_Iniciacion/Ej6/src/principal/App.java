package principal;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Centígrados a Kelvin");
		System.out.println("********************");
		
		System.out.println("Teclea temperatura en ºC: ");
		double tempC = entrada.nextDouble();
		
		double tempK = tempC + 273.15;
		
		System.out.println(tempC + "ºC son " + tempK + "ºK"); 

	}

}
