package principal;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		//ordenar por método burbuja.
		
		int [] a = {10,20,110,-1,12,5,8,2};
		
		System.out.println("Antes: " + Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i]>a[j]) {
					int aux = a[i];
					a[i]=a[j];
					a[j]=aux;
				}
			}
		}
		
		System.out.println("Después: " + Arrays.toString(a));
	}

}
