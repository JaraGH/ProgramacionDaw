package principal;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
//		String cadena = "hola desde Java";
//		
//		System.out.println(cadena.substring(0,5));
//		System.out.println(cadena.substring(7));
		
		String [] dnis = {"80137039T","30198235S" , "15835050X", 
				"30533829H", "46548712R", "30499569M", "30437328W", "30519074Y"}; 
		for (int i = 0; i < dnis.length; i++) {
			System.out.println(dnis[i]+ ", correcto? "+ esCorrectoDni(dnis[i]) );
		}
	}


	public static boolean esCorrectoDni(String dni) {
		String [] letras = {"T", "R", "W", "A", "G", "M", "Y", 
				"F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q",
				"V", "H", "L", "C", "K", "E"};
		//extraer el número del dni
		int numero = Integer.parseInt(dni.substring(0, dni.length()-1));
		//extraer la letra
		String letra = dni.substring(dni.length()-1);
		
//		int resto = numero%23;
		
//		String letraCorrecta = letras[resto];
//		if (letraCorrecta.equals(letra))
//			return true;
//		else
//			return false;
//		
		//es lo mismo
		
		return  (letras[numero%23].equals(letra));
	}
	
	
	
}
