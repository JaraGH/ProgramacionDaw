package principal;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	
		Empleado e1 = new Empleado(1, "Ana", "Soler", 2000);
		Empleado e2 = new Empleado(2, "Gema", "Casas", 2200);
		Empleado e3 = new Empleado(3, "Carlos", "Milo", 2100);
	
		e1.incrementaSalario(10);
		System.out.println(e1.toString());
		
		System.out.println(e2.getNombreCompleto());
		
		System.out.println(e1.getSalarioAnual());
		
	}
	
	

}
