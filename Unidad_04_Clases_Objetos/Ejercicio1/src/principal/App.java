package principal;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Alumno alu1 = new Alumno("1234A", "Pablo", "Motos", 
				LocalDate.of(1960, 10, 1), "DAW1");
		
		alu1.setCurso("DAW2");
		System.out.println(alu1.getCurso());
		System.out.println(alu1.getFechaNacimiento());
		
	
		
		
		
	}

}
