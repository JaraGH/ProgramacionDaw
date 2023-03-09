package principal;

import java.text.DecimalFormat;
import java.util.Iterator;

public class App {

	
	public static void main(String[] args) {
		
		System.out.println("Factoriales...");
		
		for (int x=1;x<=12;x+=3) {
			System.out.print("Factorial de " + x + "-->");
			System.out.println(factorial(x));
		}
		
	}
	
	
	static long factorial(int n) {
		if (n==0 || n==1)
			return 1;
		else 
			return n*factorial(n-1);
	}
	
	
	
	
	
	
}
