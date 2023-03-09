package principal;

import java.text.DecimalFormat;

public class App {

	
	public static void main(String[] args) {
		
		int a=220; int b = 2814;
		
		System.out.printf("Son amigos %d y %d ? ", a, b);
		System.out.println(sonAmigos(a, b));
		
	}
	
	
	static boolean sonAmigos(int n1, int n2) {
		if (n1==sumaDivisores(n2)) {
			return n2==sumaDivisores(n1);
		} else 
			return false;
	}
	
	static double sumaDivisores(int n) {		
		int suma=0;
		for (int i = 1; i <=n/2; i++) {
			if (n%i==0)
				suma+=i;
		}
		return suma;
	}
	
	
	
	
	
	
}
