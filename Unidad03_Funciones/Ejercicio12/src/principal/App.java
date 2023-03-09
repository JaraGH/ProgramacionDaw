package principal;

import java.text.DecimalFormat;
import java.util.Iterator;

public class App {

	
	public static void main(String[] args) {
		
		for (int i = 0; i <= 20; i++) {
			System.out.printf("\nEs primo %d? %b", i, esPrimo(i));
		}
		
	}
	
	
	static boolean esPrimo(int n) {
		//el cero y el uno no son primos
		if (n==0 || n==1)
			return false;
		
		for (int i = 2; i <=n/2; i++) {
			if (n%i==0)
				return false;
		}
		return true;
	}
}
