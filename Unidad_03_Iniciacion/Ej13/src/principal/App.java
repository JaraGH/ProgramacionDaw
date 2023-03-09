package principal;


import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Comparar dos números");
		System.out.println("********************");
		
		System.out.print("Teclea dos enteros... ");
		
		int numero1 = entrada.nextInt();
		int numero2 = entrada.nextInt();
			
		
		if (numero1==numero2) {
			System.out.printf("%d y %d son iguales", numero1, numero2);
		} else if (numero1<numero2){
			System.out.printf("%d es menor que %d", numero1, numero2);
		} else {
			System.out.printf("%d es mayor que %d", numero1, numero2);
		}

		
		
	}

}
