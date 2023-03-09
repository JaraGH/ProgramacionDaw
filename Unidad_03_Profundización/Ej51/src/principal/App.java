package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int filas = 16;
		int numeroTotalAsteriscos = (int) Math.pow(2, filas);
		
		// 1ª forma
		for (int i = 1; i <=filas; i++) {
			
			int asteriscosFila = (int) Math.pow(2, i);
			int blancosFila = (numeroTotalAsteriscos - asteriscosFila)/2;
			
			
			for (int j = 1; j <=blancosFila; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=asteriscosFila; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

		//2ª forma
		
//		for (int i = 1; i <= filas; i++) {
//
//			int asteriscosFila = (int) Math.pow(2, i);
//			int blancosFila = (numeroTotalAsteriscos - asteriscosFila) / 2;
//			int totalElements = asteriscosFila + blancosFila;
//			for (int j=1; j<=totalElements; j++) {
//				if (j<=blancosFila) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}

	}

}
