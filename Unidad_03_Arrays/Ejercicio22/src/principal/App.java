package principal;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		int [][] m = new int[5][5];
		Random rnd = new Random();
		
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[i].length; j++) {
				
				m[i][j]=rnd.nextInt(9)+1;
				System.out.printf("%2d ", m[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.printf("El 9 se repite %d veces.\n" , buscarEnMatriz(m, 9));
		System.out.printf("El 2 se repite %d veces.\n" , buscarEnMatriz(m, 2));
		System.out.printf("El 3 se repite %d veces.\n" , buscarEnMatriz(m, 3));
	}	
	
	static int buscarEnMatriz(int [][] m, int buscado) {
		
		int contador=0;
		for (int[] fila : m) {
			for (int valor : fila) {
				if (valor==buscado) contador++; 
			}
		}
		return contador;
	}
}
