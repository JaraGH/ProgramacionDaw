package principal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		
		//ejeercicio 1
//		Utils.stringToChar("Hola @ mundo 12");
		
		//ejercicio 2 obtener un array con las cadenas que terminen en "a"
//		String [] arrOriginal = {"hola", "a", "todos", "son", "la", "una"
//				, "de", "la", "tarde"};
//		String [] acabanEnA = Utils.getArrayStringTerminacion(arrOriginal, "a");
//		System.out.println(Arrays.toString(acabanEnA));
//		
		
		//System.out.println(Arrays.toString(Utils.getArrayStringTerminacion(a, "a")));
		
		//ejercicio 3 uso de split
//		System.out.println(Arrays.toString(Utils.getArraySplit("hola;a;todos;son;las;5", ";")));
//		
		
		//ejercicio 4
//		int [] numeros = {3,4,6,5,7,8,-1};
//		System.out.println(Utils.getPosition(numeros, 4));
		
		//ejercicio 5
		LocalDate [] fechas = {LocalDate.now(),
				LocalDate.of(2019, 01,01),
				LocalDate.of(2021, 02, 02)}; 
//		Utils.showSortedDates(fechas);
		
		
		//ejercicio 6
//		System.out.println(Utils.getCountDates(fechas, 02, 2021));

		//ejercicio 7
		LocalTime [] horas = {LocalTime.of(22, 00),
				LocalTime.of(23, 00),
				LocalTime.of(23, 10),
				LocalTime.of(23, 44)};
		
		System.out.println(Utils.getCountTimes(horas, LocalTime.of(23,05)));
	}

}
