package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
					
		System.out.println("Teclea tres números ");
		
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		
		int suma=a+b+c;
		int producto=a*b*c;
		int resta = a+b-c;
		
		System.out.println("La suma es: " + suma);
		System.out.println("El producto es: " + producto);
		System.out.println("La resta es: " + resta);

		
		
		
	}

}
