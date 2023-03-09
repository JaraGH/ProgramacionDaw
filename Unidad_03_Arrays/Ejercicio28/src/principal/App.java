package principal;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		int [][] m = {{2,4,5,6,7},{4,2,2,1,1},{5,6,7,8,8},{5,6,7,8,8}, {5,6,7,8,9} };
		
		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		}
		
		int sumaDiagonal=0;
		for (int i = 0; i < m.length; i++) {
			sumaDiagonal+=m[i][i];
		}
		System.out.println("Suma diagonal 1 " + sumaDiagonal);
		
		sumaDiagonal=0;
		int j=m[0].length-1;
		for (int i = 0; i < m.length; i++) {
			sumaDiagonal+=m[i][j];
			j--;
		}
		System.out.println("Suma diagonal 2 " + sumaDiagonal);
	}	
	
	
}
