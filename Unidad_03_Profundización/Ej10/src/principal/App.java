package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		

		for (int i = 1; i <=20; i++) {
			System.out.printf("Número: %d, Cuadrado: %f, Cubo: %f\n",
					i, Math.pow(i, 2), Math.pow(i,3));
		}
		
		
	}

}
