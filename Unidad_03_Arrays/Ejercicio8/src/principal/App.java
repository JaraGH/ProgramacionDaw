package principal;

import java.util.Arrays;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		//llenar array
		int [] a= new int[10];
		int i=0;
		while(i<a.length) {
			a[i]= rnd.nextInt(1000)+1;
			i++;
		}
		
		
		
		System.out.println("Array: " + Arrays.toString(a));
		
		System.out.println("La media: " + getMediaValores(a));
		
		System.out.println("El menor: " + getMenor(a));
		
	}
	
	

	
	static double getMediaValores(int [] a) {
		int suma=0;
		for (int i = 0; i < a.length; i++) {
			suma+=a[i];
		}
		return suma/(double)a.length;
	}
	
	
	
	
	static int getMenor(int [] a) {
		int menor=a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i]<menor)
				menor=a[i];
		}
		return menor;
	}
	
}










