package principal;

public class GestionNumeros implements INumeros  {
	
	int a=20;
	int b=20;
	int numero=200;
	
	

	@Override
	public int sumaNumeros(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public boolean esPar(int numero) {
		// TODO Auto-generated method stub
		return numero%2==0;
	}

	@Override
	public int getMayor(int a, int b) {
		// TODO Auto-generated method stub
		return (a>b)? a:b;
	}

	@Override
	public long factorial(int n) {
		long f=1;
		for (int i = 2; i <=n; i++) {
			f*=n;
		}
		return f;
	}

}
