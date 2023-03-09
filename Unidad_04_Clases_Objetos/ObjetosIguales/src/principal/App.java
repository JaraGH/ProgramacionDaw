package principal;

import java.time.LocalDate;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		String cad = "asdf";
		Persona persona1 = new Persona(1, "Ana");
		Persona persona4 = persona1;
		Persona persona2 = new Persona(1, "Ana R.A.");
		Persona persona3 = new Persona(1, "M. Ana");
		System.out.println(persona1.equals(persona2));
//		System.out.println(persona1.equals(persona3));
//		System.out.println(persona1.equals(cad));
//		System.out.println(persona1.equals(persona4));
	}

}
