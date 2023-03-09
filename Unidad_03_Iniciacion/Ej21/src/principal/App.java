package principal;


import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("**Menú**");
		System.out.println("1. Abrir");
		System.out.println("2. Cerrar");
		System.out.println("3. Conectar");
		System.out.println("4. Desconectar");
		System.out.println("5. Fin");
		System.out.println("Elige opción: ");
		
//		int opcion = entrada.nextInt();
		String opcion = entrada.next();
		
		
		switch (opcion) {
		case "1":
			System.out.printf("Abrir");
			break;
		case "2":
			System.out.printf("Cerrar");
			break;			
		case "3":
			System.out.printf("Conectar");
			break;
		case "4":
			System.out.printf("Desconectar");
			break;
		case "5":
			System.out.printf("Fin");
			break;
		default:
			System.out.println("Error en la opción");
			break;
		}
	
		
		
		
		
		
		
		
		
		
		
	}

}
