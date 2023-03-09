package principal;

import java.util.Iterator;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		String cadena1 = "1234ABC@@@@@";
		System.out.printf("\n¿Es válida la contraseña %s? %b ", cadena1,
				esValidaContraseña(cadena1));
		
		String cadena2="12ABCaaaaBBBB";
		System.out.printf("\n¿Es válida la contraseña %s? %b ", cadena2,
				esValidaContraseña(cadena2));
		
	}

	static boolean esValidaContraseña(String cadena) {
		if (cadena.length()<10)
			return false;
		else {
			int cuentaDigitos=0;
			//la pasamos a minúscula
			cadena = cadena.toLowerCase();
			for (int i=0; i<cadena.length();i++) {
				char caracter = cadena.charAt(i);
				if (caracter>='0' && caracter <='9')
					cuentaDigitos++;
				else if (caracter<'a' || caracter >'z')
					return false;
			}
			if (cuentaDigitos>=2)
				return true;
			else
				return false;
		}
	}
		
}
