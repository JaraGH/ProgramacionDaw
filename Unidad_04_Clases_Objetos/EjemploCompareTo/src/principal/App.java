package principal;

public class App {

	public static void main(String[] args) {
		
		String a = "hola";
		String b = "adiós";
		String c = "marino";
		
		//compareTo. Retorna
		// 0 - cadenas iguales
		// < 0 (menor que 0). la de la izq es menor
		// > 0 (mayor que 0). la de la izq es mayor
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println(a + " compareTo " + b + ": " + a.compareTo(b));
		System.out.println(a + " compareTo " + c + ": " + a.compareTo(c));
		 
	}

}
