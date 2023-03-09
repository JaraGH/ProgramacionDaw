package principal;

public class App {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=220; int n2=1284;
		
		int s1= sumaDivisores(n1);
		int s2= sumaDivisores(n2);
		
		if (s1==n2 && s2==n1) {
			System.out.printf("%d y %d son amigos", n1, n2);			
		} else {
			System.out.printf("%d y %d no son amigos", n1, n2);
		}
		
		
	}
	
	//funcion que recibe un argumento entero (numero)
	//y retorna/devuelve un valor entero
	static int sumaDivisores (int numero) {
		int suma=0;
		for (int i = 1; i <=numero/2; i++) {
			if (numero%i==0)
				suma+=i;
		}
		return suma;
	}
	
}
