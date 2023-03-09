package principal;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		int [] a= {1,66,15,33,2,34,2,2,65,39,15,78};
		
		System.out.println(Arrays.toString(a));
		
		int aux=a[0];		
		
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			a[i]=aux;
			aux=temp;
		}
		a[0]=aux;
		
		System.out.println(Arrays.toString(a));
		
	}
	
		
}
