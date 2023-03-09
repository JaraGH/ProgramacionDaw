package principal;

import java.util.Iterator;
import java.util.Random;

public class App {

	public static void main(String[] args) {

		fibonacci(10);
		
		//con una función recursiva. Poco eficiente
//		System.out.println("\n\n\nAhora con recursividad");
//		for (int i = 1; i <=10; i++) {
//			System.out.print(fibonacciRecursivo(i) + " ");
//		}
	}

	static void fibonacci(int terminos) {
		int primero=-1;
		int segundo=1;
		for (int i = 1; i <=terminos; i++) {
			int siguiente = primero + segundo;
			primero=segundo;
			segundo=siguiente;
			System.out.print(siguiente + " ");
			if (i%10==0)
				System.out.println();
		}
	}
	
	static int fibonacciRecursivo(int posicion) {
	
		if (posicion==1)
			return 0;
		else if (posicion==2)
			return 1;
		else
			return fibonacciRecursivo(posicion-1) +
					fibonacciRecursivo(posicion-2);
	}
	
}
