package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String opcion;
		do {
			System.out.println("Men�");
			System.out.println("1. C�digo ASCII del car�cter...");
			System.out.println("2. Car�cter asociado al c�digo ASCII�");
			System.out.println("3. Listado de min�sculas");
			System.out.println("4. Listado de may�sculas");
			System.out.println("5. Fin");
			System.out.println("Elige opci�n: ");
			opcion=entrada.next();
			
			switch (opcion) {
			case "1":
				System.out.println("Introduce un car�cter: ");
				char caracter = entrada.next().charAt(0);
				int ascii = caracter;
				System.out.println("Su c�digo ASCII es " + ascii);
				break;
			case "2":
				System.out.println("Introduce un c�digo ASCII: ");				
				int codAscii = entrada.nextInt();
				caracter = (char) codAscii;
				System.out.println("El car�cter asociado es  " + caracter);
				break;
			case "3":
				System.out.println("Min�sculas");
				for (char letra='a'; letra<='z'; letra++) {
					System.out.println(letra);
				}
				break;
			case "4":
				System.out.println("May�sculas");
				for (char letra='A'; letra<='Z'; letra++) {
					System.out.println(letra);
				}
				break;
			case "5":
				System.out.println("***FIN***");
				break;
			default:
				System.out.println("Opci�n err�nea");
			}
			
		} while (!opcion.equalsIgnoreCase("5"));
	}

}
