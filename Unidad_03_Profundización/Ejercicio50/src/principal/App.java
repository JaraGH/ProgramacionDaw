package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String opcion;
		do {
			System.out.println("Menú");
			System.out.println("1. Código ASCII del carácter...");
			System.out.println("2. Carácter asociado al código ASCII…");
			System.out.println("3. Listado de minúsculas");
			System.out.println("4. Listado de mayúsculas");
			System.out.println("5. Fin");
			System.out.println("Elige opción: ");
			opcion=entrada.next();
			
			switch (opcion) {
			case "1":
				System.out.println("Introduce un carácter: ");
				char caracter = entrada.next().charAt(0);
				int ascii = caracter;
				System.out.println("Su código ASCII es " + ascii);
				break;
			case "2":
				System.out.println("Introduce un código ASCII: ");				
				int codAscii = entrada.nextInt();
				caracter = (char) codAscii;
				System.out.println("El carácter asociado es  " + caracter);
				break;
			case "3":
				System.out.println("Minúsculas");
				for (char letra='a'; letra<='z'; letra++) {
					System.out.println(letra);
				}
				break;
			case "4":
				System.out.println("Mayúsculas");
				for (char letra='A'; letra<='Z'; letra++) {
					System.out.println(letra);
				}
				break;
			case "5":
				System.out.println("***FIN***");
				break;
			default:
				System.out.println("Opción errónea");
			}
			
		} while (!opcion.equalsIgnoreCase("5"));
	}

}
