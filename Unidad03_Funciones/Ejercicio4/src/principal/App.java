package principal;

public class App {

	
	public static void main(String[] args) {
		
		
		for (int i = 65; i < 90; i++) {
			char caracter = getCaracter(i);
			System.out.printf("\nCód. Ascii: %d --> carácter: %s",
					i, caracter);
		}
		
//		System.out.println(dameCaracter(65));
//		
//		char cc=dameCaracter(66);
		
		
		
	}
	
	
	//dos formas distintas
	static char dameCaracter (int codAscii) {
		char car = (char) codAscii;
		return car;
	}	
	
	static char getCaracter(int codAscii) {
		return (char) codAscii;
	}
	
	
	
	
	
	
}
