package principal;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int i=20;
		Scanner entrada = new Scanner(System.in);
		Random rnd = new Random();
		
		Persona p = new Persona("12341234F", "Pablo Alborán",
				LocalDate.of(1990, 1, 1)); 
		
		Persona persona = new Persona("23423423G", "Alba López", 
				LocalDate.of(2001, 11, 11));
		

		
		System.out.println(p.getDni());
		System.out.println(p.getNombre());
		System.out.println(p.getFechaNacimiento());
		
		p.setNombre("Arnold Swart");
		
		System.out.println(p.toString());
		
	}

}
