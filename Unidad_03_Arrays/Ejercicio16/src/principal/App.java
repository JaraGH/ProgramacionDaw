package principal;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		int [] a= {1,66,15,33,2,34,65,39,15,78};
		
		
		
		System.out.println("Antes: " + Arrays.toString(a));
		intercambiarValores(a);
		System.out.println("Después: " + Arrays.toString(a));
		
	}
	
	static void intercambiarValores(int [] a) {
		int j=a.length-1;
		for (int i = 0; i < a.length/2; i++) {
			int aux = a[i];
			a[i]=a[j];
			a[j]=aux;
			j--;
		}
	}	
}
