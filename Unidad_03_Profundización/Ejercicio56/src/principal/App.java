package principal;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int numero = 153;
		
		String numeroString = Integer.toString(numero);
		
		int suma=0;
		for (int i = 0; i < numeroString.length(); i++) {
			String digito = numeroString.charAt(i) + "";			
			suma+= Math.pow(Integer.parseInt(digito), numeroString.length());			
		}
		if (suma==numero)
			System.out.println("EL número " + numero + " es de ArmsStrong");
		else
			System.out.println("EL número " + numero + " no es de ArmsStrong");
		
				
		
	}

}
