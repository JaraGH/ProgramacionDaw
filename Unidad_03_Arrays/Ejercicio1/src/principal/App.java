package principal;


import java.util.Arrays;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int [] a = new int[10];
		
					
		for (int i = 0; i < a.length; i++) {
			a[i]=rnd.nextInt(100)+1;  //llenar
			//System.out.print(a[i] + " "); //mostrar
		}
		
		//muestra el array completo
		System.out.println(Arrays.toString(a));
		
		if (a[0]==a[a.length-1])
			System.out.println("El primer valor y el último son iguales");
		else
			System.out.println("El primer valor y el último no son iguales");
		
		
	
		
		
	}
	
	

}
