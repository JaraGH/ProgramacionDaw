package principal;


import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Media aritmética con IF");
		System.out.println("***********************");
		
		System.out.print("Teclea tres doubles ");
		
		double n1 = entrada.nextDouble();
		double n2 = entrada.nextDouble();
		double n3 = entrada.nextDouble();
		
		double media = (n1+n2+n3)/3;
		
		if (media==10) {
			System.out.printf("La media %f es igual a 10", media);
		} else if (media > 10) {
			System.out.printf("La media %f es mayor que 10", media);
		} else {
			System.out.printf("La media %f es menor que 10", media);
		}
		
	}

}
