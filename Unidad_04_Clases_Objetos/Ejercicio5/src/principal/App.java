package principal;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Alumno a = new Alumno("12929", "Juanma", "Castaño",
				LocalDate.of(1988, 10, 10), "DAW1", 6.2, 5.3);
		
		System.out.println(a.getNotaMedia());
		System.out.println(a.getDatosAlumno());
		
		
		
	}

}
