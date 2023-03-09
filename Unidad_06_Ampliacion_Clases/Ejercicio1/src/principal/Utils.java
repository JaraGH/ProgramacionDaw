package principal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;

public class Utils {
	// ejercicio1
	public static void stringToChar(String string) {
		
		
//		con for		
//		for(int i=0;i<string.length();i++) {
//			char caracter = string.charAt(i);
//			System.out.printf("Carácter: %s", caracter);
//
//			if (Character.isLetter(caracter))
//				System.out.println("-->Letra");
//			else if (Character.isDigit(caracter))
//				System.out.println("-->Dígito");
//			else
//				System.out.println("-->Otro");
//
//		}
		
		//con for-each
		for (char caracter: string.toCharArray()) {

			System.out.printf("Carácter: %s", caracter);

			if (Character.isLetter(caracter))
				System.out.println("-->Letra");
			else if (Character.isDigit(caracter))
				System.out.println("-->Dígito");
			else
				System.out.println("-->Otro");
		}
	}

	// ejercicio2
	public static String[] getArrayStringTerminacion(String[] arrOriginal, 
			String terminacion) {

		String[] retorno = new String[arrOriginal.length];

		int indice = 0;
		for (String string : arrOriginal) {
			if (string.endsWith(terminacion))
				retorno[indice++] = string;
		}

		return Arrays.copyOf(retorno, indice);
	}

	// ejercicio3
	public static String[] getArraySplit(String string, String separator) {
		return string.split(separator);
	}

	// ejercicio 4
	public static int getPosition(int[] array, int value) {
		// ordenar
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		// buscar en array
		// retorna negativo si no lo encuentra
		int retorno = Arrays.binarySearch(array, value);
		
		return (retorno<0)? -1: retorno;
		
//		if (retorno < 0)
//			return -1;
//		else
//			return retorno;
	}

	// ejercicio 5
	public static void showSortedDates(LocalDate[] fechas) {
		Arrays.sort(fechas);
		//Arrays.sort(fechas, Comparator.reverseOrder()); de más actual a más antigua 
		System.out.println(Arrays.toString(fechas));
	}

	// ejercicio 6
	public static int getCountDates(LocalDate[] fechas, int month, int year) {
		int counter = 0;
		for (LocalDate fecha : fechas) {
			if (fecha.getMonthValue() == month && fecha.getYear() == year)
				counter++;
		}
		return counter;
	}

	// ejercicio 7
	public static int getCountTimes(LocalTime[] hours, LocalTime hour) {
		int counter = 0;
		for (LocalTime hora : hours) {
			if (hora.isBefore(hour))
				counter++;
		}
		return counter;
	}
}
