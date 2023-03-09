package principal;

import java.util.Arrays;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		int [] a= {1,66,15,33,2,34,65,39,15,78};
		
		System.out.println("Array antes: " + Arrays.toString(a));
		
		int aux = a[0];
		a[0]=a[a.length-1];
		a[a.length-1] = aux;
		
		System.out.println("Array después: " + Arrays.toString(a));
			
	}
}
