package principal;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		int [][] m = new int[3][4];
		
		int valor=50;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]=valor;
				valor++;
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		}
		
	}
	
}
