package principal;


import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Par o impar");
		System.out.println("***********");
		
		System.out.print("Teclea un entero ");
		
		int n = entrada.nextInt();
		
		if (n%2==0) {
			System.out.printf("%d es par", n);
		} else {
			System.out.printf("%d es impar", n);
		}

		
		
	}

}
