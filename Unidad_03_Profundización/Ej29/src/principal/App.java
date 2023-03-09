package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		String repetir = "";
		
		do {
			System.out.println("Teclea cadena: ");
			
			String cadena = entrada.next();
			
			char letraPrimera = cadena.charAt(0);
			char letraUltima = cadena.charAt(cadena.length()-1);
			
			int codAsciiPrimera = letraPrimera;
			int codAsciiUltima = letraUltima;
			
			
			System.out.println("Letra primera: " + letraPrimera);
			System.out.println("Ascii 1ª: " + codAsciiPrimera);
			System.out.println("Letra última: " + letraUltima);
			System.out.println("Ascii última: " + codAsciiUltima);
			
			System.out.print("¿Otra vez (S/N)?");
			repetir = entrada.next();
			
		} while (repetir.equalsIgnoreCase("s"));
		
		
		
		
		

	}

}
