package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Múltiplos de 3 entre dos enteros...");
		
		System.out.println("\nTeclea dos enteros: ");
		int n1= entrada.nextInt();
		int n2= entrada.nextInt();
		
		System.out.printf("Los múltiplos de 3 entre %d y %d\n", n1, n2);
		
		//intercambio si el 1º es >
		if (n1>n2) {
			int aux = n1;
			n1=n2;
			n2=aux;
		}		
		
		
		int contador=0;
		for (int i = n1; i <=n2 ; i++) {
			
			if (i%3==0) { //si i es multiplo de 3, contador++
				System.out.println(i);
				contador++;
				
			}
				
			
		}
		
		System.out.printf("\nHay %d múltiplos de 3", contador);
		
		
		
		
		
		
		
		
	}

}
