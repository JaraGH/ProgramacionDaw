package principal;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		int [][] m = {{2,4,5,6,7},{4,2,2,1,1},{5,6,7,8,8,10,12}};
				
		int mayor=m[0][0];
		for (int i = 0; i < m.length; i++) {
			
			int sumaFila=0;
			for (int j = 0; j < m[i].length; j++) {				
				System.out.printf("%3d ", m[i][j]);
				sumaFila+=m[i][j];
				if (m[i][j]>mayor)
					mayor=m[i][j];
			}
			System.out.printf("\t\tSuma fila: "
					+ "%d. Nº de columnas: %d\n", sumaFila, m[i].length);
			
			
		}
		System.out.println("El mayor valor de la matriz: " + mayor);
	}	
	
	
}
