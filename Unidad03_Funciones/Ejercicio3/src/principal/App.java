package principal;

public class App {

	
	public static void main(String[] args) {
		
		
		for (int i = 2000; i <=2040; i++) {
			System.out.printf("\nEs bisiesto el año %d? %b",
					i, esBisiesto(i));
		}
		
	}
	
	static boolean esBisiesto(int anio) {
		
//		if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0)
//			return true;
//		else
//			return false;
		
		//es lo mismo
		return ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0);
		
	}
	
	
	
	
	
	
}
