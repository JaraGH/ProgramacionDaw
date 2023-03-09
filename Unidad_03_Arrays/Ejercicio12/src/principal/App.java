package principal;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random rnd = new Random();
		
		int [] a = new int[10];
				
		//llenar array
		for (int i = 0; i < a.length; i++) {
			a[i]=rnd.nextInt(100)+1;
		}
		
		System.out.println(Arrays.toString(a));
		
		
		//correcto
		int inicio, fin;
		do {
			System.out.print("Introduce posiciones de inicio y fin:");
			inicio = entrada.nextInt();
			fin = entrada.nextInt();	
		}while(inicio>fin || inicio<0 || fin>=a.length);
		
		int sumaArray = sumaTramoArray(a, inicio, fin);
		System.out.println("Suma: " + sumaArray);
		
		
	}
	
	static int sumaTramoArray(int [] a, int inicio, int fin) {
		int suma=0;
		for (int i = inicio; i <=fin; i++) {
			suma+=a[i];
		}
		return suma;
	}	
	
	
}
