package principal;

public class App {

	public static void main(String[] args) {
		
		int anio=2020;
		if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0)
			System.out.println("Bisiesto");
		else
			System.out.println("No bisiesto");
			

	}

}
