package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		double numero= entrada.nextDouble();
		
		for (int i = 1; i <=10; i++) {
			System.out.printf("\n%f dividido entre %d es %f",
					numero, i, (numero/i));
		}
		
		
	}

}
