package principal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=120;
		System.out.printf("Divisores de %d", n);
		int sumaDivisores=0;
		for (int i = 1; i <=(n/2); i++) {
			
			if (n%i==0) {
				System.out.printf("\n%d es divisor de %d", i, n);
				sumaDivisores+=i;
			}
		}
		System.out.printf("\nSuma divisores de %d: %d", 
				n, sumaDivisores);
	}

}
