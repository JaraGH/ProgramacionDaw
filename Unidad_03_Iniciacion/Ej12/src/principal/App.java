package principal;


import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Números iguales?");
		System.out.println("****************");
		
		System.out.print("Teclea dos enteros... ");
		
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		
		if (n1==n2) {
			System.out.println(n1 + " es igual a " + n2);
		} else {
			System.out.printf("Los números %d y %d no son iguales", n1,n2);
		}

		
		
	}

}
