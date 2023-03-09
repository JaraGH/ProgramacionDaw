package principal;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {

	public static void main(String[] args) {   //2000 2211 2011 1978
		// TODO Auto-generated method stub
		
		for (String string : args) {
			System.out.println("¿" + string +
				" es bisiesto? " + 
				
				LocalDate.of(Integer.parseInt(string), 1, 1).isLeapYear()
			);
		
		}
	}

}
