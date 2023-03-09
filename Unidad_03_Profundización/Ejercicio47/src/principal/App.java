package principal;

import java.util.Random;

public class App {

	public static void main(String[] args) {

		
		Random rnd = new Random();
		int mayor=0; int menor=0;
		for (int i = 0; i < 10; i++) {
			int numero = rnd.nextInt(50)+1; //[1,50]
			System.out.println(numero);
			
			if (numero>mayor || i==0)
				mayor=numero;
			
			if (numero<menor || i==0)
				menor=numero;
		}
		System.out.println("El mayor: " + mayor);
		System.out.println("El menor: " + menor);
		
		 
	}

}
