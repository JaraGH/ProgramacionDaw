package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "ABC@@dAAAdef456@@";
		
		int cuentaMayusculas=0, cuentaMinusculas=0,  cuentaDigitos=0;
		for (int i = 0; i < cadena.length(); i++) {
			
			char caracter = cadena.charAt(i);
			
			if (caracter>='A' && caracter<='Z')
				cuentaMayusculas++;
			else if (caracter>='a' && caracter<='z')
				cuentaMinusculas++;
			else if (caracter>='0' && caracter<='9')
				cuentaDigitos++;
		}
		
		System.out.printf("La cadena %s tiene:", cadena);
		System.out.printf("\n%d mayúsculas", cuentaMayusculas);
		System.out.printf("\n%d minísculas", cuentaMinusculas);
		System.out.printf("\n%d dígitos", cuentaDigitos);
	}

}
