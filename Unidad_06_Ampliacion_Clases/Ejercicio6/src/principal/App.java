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
			new Persona(1, "María", LocalDate.of(2000, 9, 01)),
			new Persona(5, "Ana", LocalDate.of(2000, 10, 01)),
			new Persona(6, "Ana", LocalDate.of(2000, 9, 30)),
		};
		
		
		//ordenar por nombre
		Arrays.sort(personas, new Comparator<Persona>() {

			@Override
			public int compare(Persona per1, Persona per2) {
				// TODO Auto-generated method stub
				int result = per1.getNombre().compareTo(per2.getNombre());  
				return (result==0)? per1.getFechaNacimiento().compareTo(per2.getFechaNacimiento()): result;
				
			}
			
		});

	
		
		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}
	}

}
