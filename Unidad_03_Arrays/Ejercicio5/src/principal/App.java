package principal;

import java.util.Arrays;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		
		int [] a= {1,66,15,330,2,34,65,39,15,78};
	
		int mayor = getMayor(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Mayor: " + mayor);
		
		
	}
	
	static int getMayor(int [] array) {
		
		int mayor=array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i]>mayor)
				mayor=array[i];
		}
		return mayor;
	} 
	
	
}
