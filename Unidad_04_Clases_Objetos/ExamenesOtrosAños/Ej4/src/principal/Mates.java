package principal;

public class Mates {
	public static final double PI = 3.1419;

	public static double areaCirunferencia(double radio) {
		return 2 * PI * radio;
	}

	public static boolean esPar(int n) {
		return n % 2 == 0;
	}

	public static boolean esPrimo(int n) {
		if (n == 0 || n == 1)
			return false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false; // no primo
		}
		return true; // es primo
	}

	public static long sumaDivisores(int n) {
		long sumaDiv = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sumaDiv += i;
		}
		return sumaDiv;
	}

	public static boolean sonAmigos(int a, int b) {
		return a == sumaDivisores(b) && b == sumaDivisores(a);
	}
}
