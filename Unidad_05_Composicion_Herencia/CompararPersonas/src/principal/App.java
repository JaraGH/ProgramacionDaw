package principal;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona [] personas = {new Persona(1, "Ana", 15), 
				new Persona(2, "Luis", 5),
				new Persona(3, "Eva", 22)
		};
		
		Arrays.sort(personas);
		
		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}
		
		
//		
//		System.out.println(persona1.compareTo(persona2));
//		System.out.println(persona2.compareTo(persona1));
//		System.out.println(persona1.compareTo(persona1));
	}

}
