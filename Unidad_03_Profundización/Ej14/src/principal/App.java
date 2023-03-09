package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String respuesta="";
		
		do {
			
			System.out.println("**Menú**");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Salir");
			System.out.println("Elige opción: ");
			
			respuesta = entrada.next();
			
			
			switch (respuesta) {
			case "1":
				System.out.println("Dos números?");
				int n1 = entrada.nextInt();
				int n2 = entrada.nextInt();
				System.out.println("Su suma: " + (n1+n2));
				break;
			case "2":
				System.out.println("Dos números?");
				n1 = entrada.nextInt();
				n2 = entrada.nextInt();
				System.out.println("Su resta: " + (n1-n2));
				break;
			case "3":
				System.out.println("Fin");
				break;	
			default:
				System.out.println("Opción errónea");
			}
			
			
		} while (!respuesta.equals("3"));
		
		
		
	}

}
