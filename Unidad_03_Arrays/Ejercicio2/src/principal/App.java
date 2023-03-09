package principal;

import java.util.Arrays;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int [] a = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=rnd.nextInt(10)+1;  //llenar			
		}
		
		//mostrar
		int i=0;
		while (i<a.length) {
			System.out.print(a[i] + " ");
			i++;
		}
			
	}
}
