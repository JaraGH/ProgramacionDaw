package principal;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.print("Teclea nº elementos");
		int numeroElementos = entrada.nextInt();
		
		//crear array
		int [] a = new int[numeroElementos];
	
		int relleno=3;
		for (int i = 0; i < a.length; i++) {
			a[i]=relleno;
			relleno+=2;
		}
		
		System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(a));
	}
	
	
	
	
}
