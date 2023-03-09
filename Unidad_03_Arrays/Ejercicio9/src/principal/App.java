package principal;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		int [] a= {1,66,15,33,2,34,2,2,65,39,15,78};
		
		System.out.println(Arrays.toString(a));
		
		int busca=15;
		
		int indice = buscarEnArray(a, busca);
		
		if (indice==-1) {
			System.out.println("no está");
		} else {
			System.out.println("Está en posción " + indice);
		}
		
//		System.out.printf("Buscando el %d. Encontrado en %d", 
//				2, buscarEnArray(a, 2));
//		
		System.out.printf("\nEl valor %d aparece %d veces", 2, 
				contarRepeticiones(a, 2));
		
	}
	
	static int buscarEnArray(int [] b, int buscado) {
		for (int i = 0; i < b.length; i++) {
			if (b[i]==buscado)
				return i;			
		}
		return -1;
	}	
	
	static int contarRepeticiones(int [] b, int buscado) {
		int contador=0;
		for (int i = 0; i < b.length; i++) {
			if (b[i]==buscado)
				contador++;
		}
		return contador;
	}
	
}
