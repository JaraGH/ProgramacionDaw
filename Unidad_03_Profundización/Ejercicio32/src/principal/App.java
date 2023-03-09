package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String respuesta;
		
		do {
			System.out.println("Teclea año y nombre de mes: ");
			int anio = entrada.nextInt();
			entrada.nextLine();
			String mes = entrada.next();
			
			int numeroDias = switch (mes) {
			
				case "enero", "marzo", "diciembre", 
						"octubre", "mayo", "julio", "agosto" -> {					
					yield 31;
				}
				case "abril", "junio", "septiembre", "noviembre" -> {
					yield 30;
				}
				case "febrero" ->{
					if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0)
						yield 29;
					else
						yield 28;
				}
				default -> -1;
				
			};
			
			if (numeroDias==-1)
				System.out.println("Error en el mes");
			else
				System.out.printf("\n%s del año %d tiene %d días", 
						mes, anio,numeroDias);
			
			System.out.println("\n¿Otra vez (s/n)?");
			respuesta = entrada.next();

		} while (respuesta.equalsIgnoreCase("s"));

	}

}
