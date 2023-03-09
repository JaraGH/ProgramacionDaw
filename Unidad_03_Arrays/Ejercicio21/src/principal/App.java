package principal;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		int [][] m = {{4,5,6},{10,1,12},{14,2,3}}; 
		
		for (int i = 0; i < m.length; i++) {
			
			int sumaFila=0;
			
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%3d ", m[i][j]);
				sumaFila+=m[i][j];
			}
			System.out.println("-->" + sumaFila);
		}
	}	
}
