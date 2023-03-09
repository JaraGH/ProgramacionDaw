package principal;

import java.text.DecimalFormat;
import java.util.Iterator;

public class App {

	
	public static void main(String[] args) {
		
		for (double centi=10.5;centi<=25;centi+=0.5) {
			
			double kelvin = gradosCK(centi);
			double fahrenheit = gradosCF(centi);
			
			System.out.printf("\n%.2fºC equivalen a %.2fºK y a %.2fºF", centi, kelvin, fahrenheit);
		}
		
	}
	
	
	static double gradosCK(double centigrados) {
		return centigrados + 273.15;
	}
	
	
	static double gradosCF(double centigrados) {
		return centigrados * 1.8 + 32;
	}
	
}
