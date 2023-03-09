package principal;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		DvdCine dvd1 = new DvdCine ("El hobbit. La desolación de Smaug", 
				"Peter Jackson", "New Line Cinema." + "Metro-Goldwyn-Mayer",
				"Ian McKellen, Martin Freeman", "Ciencia ficción", "Bla...", 123);    
		DvdCine dvd2 = new DvdCine ("El Padrino", 
				"Francis Ford Copola", "Paramount Pictures" , 
				"Al Pacino, Marlon Brando", "Drama", "Bla...", 175);
		
		System.out.println("Misma productora: " + dvd1.mismaProductora(dvd2));
		System.out.println("Thirller: " + dvd1.isThriller());

		
	}

}
