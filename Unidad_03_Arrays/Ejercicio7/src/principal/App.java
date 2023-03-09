package principal;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		int [] a= {1,66,15,33,2,34,65,39,15,78};
		
		System.out.println("Array inicial: " + Arrays.toString(a));
		System.out.println("Array con negativos: " + 
				Arrays.toString(getArrayEnteros(a)));
		
	}
	
	static int [] getArrayEnteros(int [] a) {
		
		int [] b = new int[a.length];
		
		for (int i = 0; i < b.length; i++) {
			if (i%2==0)
				b[i]=a[i];
			else
				b[i]=a[i]*-1;
		}
		return b;
	}
	
	
	
}
