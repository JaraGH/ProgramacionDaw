package principal;

public class App {

	
	public static void main(String[] args) {
		
		int x=9, y=11;
		System.out.printf("El mayor entre %d y %d es: %d",
				x, y, getElMayor(x, y));
		
		int m = getElMayor(100, y);
		System.out.printf("\nEl mayor entre %d y %d es: %d",
				100, y, m);
		
		
	}
	
	static int getElMayor(int a, int b) {
		return (a>b)? a: b;
	}
	
	
}
