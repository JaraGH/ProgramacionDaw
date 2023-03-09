package principal;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Taxi t1 = new Taxi("1400-BMC", "Sur", "Diesel", "234234", "234234");
		Taxi t2 = new Taxi("1444-LMC", "Norte", "Diesel");
		Taxi t3 = new Taxi("2224-LMC", "Norte", "Híbrido");
		Taxi t4 = new Taxi("7044-GMC", "Oeste", "Híbrido");
		
		
		
		
		System.out.println(t4.toString());
		
		
		System.out.println(t2.mismoDistrito(t3));
//		System.out.println(t3.mismoDistrito(t2));
//		System.out.println(t2.mismoDistrito(t4));
		
		
		System.out.println(t1.getCoordenadas());
	
		
		
		
	}

}
