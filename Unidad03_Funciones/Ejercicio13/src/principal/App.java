package principal;

import java.text.DecimalFormat;
import java.util.Iterator;

public class App {

	
	public static void main(String[] args) {
		
		int numero=123;
		
		
		System.out.println("Número: " + numero);
		System.out.println("Suma dígitos: " + sumaDigitos(numero));
		System.out.println("Suma dígitos: " + sumaDigitos2(numero));
		
	}
	
	static int sumaDigitos(int numero) {
		
		
		String cadenaNum = Integer.toString(numero);
		//recorremos cadenaNum y extraemos caracteres		
		int sumaDigitos=0;
		for (int i = 0; i < cadenaNum.length(); i++) {
			char digitoChar = cadenaNum.charAt(i);
			String digitoString = String.valueOf(digitoChar);
			int digito = Integer.parseInt(digitoString);
			sumaDigitos+=digito;
		}
		return sumaDigitos;
		
	}
	
	static int sumaDigitos2(int numero) {
		
		int copiaNumero = numero;
		int sumaDigitos=0;
		while(copiaNumero>0) {
			int digito = copiaNumero%10;
			sumaDigitos+=digito;
			copiaNumero/=10;
		}
		return sumaDigitos;
	}
	
}
