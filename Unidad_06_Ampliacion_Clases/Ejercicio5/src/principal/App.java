package principal;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona [] personas = {
			new Persona(4, "Ana", LocalDate.of(2000, 10, 01)),
			new Persona(2, "Elena", LocalDate.of(2009, 11, 01)),
			new Persona(3, "Sara", LocalDate.now()),
			new Persona(1, "María", LocalDate.of(2000, 9, 01))			
		};
		
		OrdenarPersonas.ordenar(personas, "fecha");
		
		
		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}
	}

}
