package principal;

import java.time.LocalDate;
import java.util.Date;

public class App {

	public static void main(String[] args) {

		System.out.println("Fecha actual con Localdate: " + getFechaActualconLocalDate());
		System.out.println("Fecha actual con Date: " + getFechaActualConDate());
	}

	static String getFechaActualconLocalDate() {		
		LocalDate fecha = LocalDate.now();
		return fecha.toString();
	}

	static String getFechaActualConDate() {
		Date fecha = new Date();
		return fecha.toString();
	}
	
}
