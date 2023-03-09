package principal;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String cadena = "reconuynocer";
		
		int i=0, j=cadena.length()-1;
		while(cadena.charAt(i)==cadena.charAt(j) && i<j) {
			i++;
			j--;
		}
		
		System.out.println(i + " " + j);
		
		if (i>=j) 
			System.out.printf("%s es palíndromo",cadena);
		else
			System.out.printf("%s no es palíndromo", cadena);
		

	}

}
