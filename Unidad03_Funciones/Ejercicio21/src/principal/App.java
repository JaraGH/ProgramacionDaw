package principal;

import java.time.LocalDate;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		
		int num=201113000;
		int digito=1;
		int veces = contarDigitoEnNumero(num, digito);
		System.out.printf("El número %d contiene %d veces el dígito %d",
				num, veces, digito);
		
	}


	static int contarDigitoEnNumero(int numero, int digito) {
		int contador=0;
		while(numero>0) {
			int digi = numero%10;
			if (digi==digito) {
				contador++;
			}
			numero/=10;
		}
		return contador;
		
	}
	
}
