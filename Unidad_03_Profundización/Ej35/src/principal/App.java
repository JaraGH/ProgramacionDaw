package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("Teclea un nº entero positivo: ");
//		int n = entrada.nextInt();
		
		int n= 1245;
		
		//construir el divisor inicial
		int divisor=1;
		
		while(divisor<n) {
			divisor*=10;
		}
		divisor/=10;
		
		
		//obtener los dígitos 1 a 1		
		do {
			int digito = n/divisor;
			int resto = n%divisor;
			System.out.print(digito + " ");
			divisor/=10;
			n=resto;
		} while (divisor>=1);
		
		
		
		
	}

}
