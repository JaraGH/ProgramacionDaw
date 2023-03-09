package principal;

public class App {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//pruebas de llamadas
//		int a=100, b=200;
//		
//		int c = suma(a,b);
//		
//		System.out.println(suma(a,suma(5,5)));
		
//		char primeraLetra = getPrimerCaracter("Hola");
//		
//		
//		System.out.println(getPrimerCaracter("hola"));
		
		
		System.out.println("Es par 2? " + esPar(2));
		System.out.println("Es par 3? " + esPar(3));
		
		for (int i = 10; i <21; i++) {
			
			System.out.printf("\nEs par %d --> %b", i, esPar(i));
		}
		
	}
	
	//función que recibe dos números enteros 
	//y retorna su suma
	
	static int suma (int a, int b){
		//return a+b;
		int s = a+b;
		return s;
	}
	
	
	
	//función que recibe un String y retorna
	//el caracter de inicio
	
	static char getPrimerCaracter(String cadena){
		return cadena.charAt(0);
	}
	
	//funcion que recibe 2 enteros 
	//y retorna el mayor
	
	static int getMayor(int a, int b) {

//		int mayor;
//		
//		if (a>b)
//			mayor=a;
//		else
//			mayor = b;
//		
//		return mayor;
		
		return (a>b)? a: b;
	}
	
	//función que retorna true/false
	//si un nº pasado es par o no(impar)
	
	static boolean esPar(int numero) {
		
//		if (numero%2==0)
//			return true;
//		else
//			return false;
		
		return (numero%2==0)? true: false;
		
		
	}
	
	
		
}
