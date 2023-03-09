package principal;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
//		
		String [] cadenas = {"asimilar", "drOmedario",
				"calvinista", "lagartija", 
				"tiovivo", "salamandra"}; 

		System.out.println(Arrays.toString(cadenas));
		
		System.out.println("\nCadena con más vocales: " + cadenaConMasVocales(cadenas));
		
		
	
	}
	
	static String cadenaConMasVocales(String [] cadenas) {
		
		int cuentaVocalesMayor=cuentaVocales(cadenas[0]);
		String cadenaMasVocales=cadenas[0];
		
		for (int i=1;i<cadenas.length;i++) {
			
			int cuentaVocalesActual=cuentaVocales(cadenas[i]);
			
			if (cuentaVocalesActual>cuentaVocalesMayor) {
				cuentaVocalesMayor=cuentaVocalesActual;
				cadenaMasVocales=cadenas[i];
			}
		}
		return cadenaMasVocales;
		
	}
	
	static int cuentaVocales(String cadena) {
		String vocales="aeiou";
		int contadorVocales=0;
		cadena = cadena.toLowerCase();
		for (int i = 0; i < cadena.length(); i++) {
			if (vocales.indexOf(cadena.charAt(i))>=0)
				contadorVocales++;
		}
		return contadorVocales;
	}
	
}
