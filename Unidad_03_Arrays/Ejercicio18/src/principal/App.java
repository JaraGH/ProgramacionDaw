package principal;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		String [] contrasenas = {"ABC123434", "asdfasdf$$@",
				"###34234234", "12341234ABC", "asdfasdfB333"};
		
		
		
		
		
		for (int i = 0; i < contrasenas.length; i++) {
//			boolean correcta = esCorrecta(contrasenas[i]);
//			System.out.printf("¿Es correcta %-20s? %b\n", contrasenas[i], correcta);
			System.out.printf("¿Es correcta %s? %b\n", contrasenas[i], 
					esCorrecta(contrasenas[i]));
		}
//		System.out.println();
//		//con for-each
//		for (String password : contrasenas) {
//			System.out.printf("¿Es correcta %s? %b\n", 
//					password, 
//					esCorrecta(password));
//		}
		
	}

	
	static boolean esCorrecta(String cadena) {
		//correcta, dos o mas numeros
		//solo letras y numeros
		//length>=10
		cadena = cadena.toLowerCase();
		if (cadena.length()<10)
			return false;
		else {
			int contadorNumeros=0;
			for (int i = 0; i < cadena.length(); i++) {
				char caracter = cadena.charAt(i);
				if ((caracter<'a' || caracter>'z') &&
					(caracter<'0' || caracter>'9'))
					return false;
				else if (caracter>='0' && caracter<='9') //digito
					contadorNumeros++;
			}
			if (contadorNumeros>=2)
				return true;
			else 
				return true;
		}
	}
	
}
