package principal;

import java.util.Arrays;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		
		int [] a= new int[10];
		
		int valorRelleno=50;
		
		for (int i = 0; i < a.length; i++) {
			
			a[i]=valorRelleno;
			valorRelleno+=5;
			
		}
		System.out.println("Array completo: " 
		+ Arrays.toString(a));
		
		mostrarPosicionesPares(a);	
	}
	
	static void mostrarPosicionesPares(int [] a) {
		System.out.println("\nContenido de las posiciones pares");
		
		for (int i = 0; i < a.length; i+=2) {
			System.out.printf("Posición %d, valor %d\n",
					i, a[i]);
		}
	}
}
