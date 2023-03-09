package principal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] comprobarPares = {2,3,5,5,66,7,1};
        int [] comprobarPrimos = {13, 15, 11, 16, 12, 90, 230};
        int [] comprobarAmigos = {220, 18, 1184, 18000, 17296, 18416, 1299, 1210, 20, 284};
        
        System.out.println("Pares");
        for (int i : comprobarPares) {
			System.out.printf("%d es par? %b\n", i, Mates.esPar(i));
		}
        
        
        System.out.println("Primos");
        for (int i : comprobarPrimos) {
			System.out.printf("%d es primo? %b\n", i, Mates.esPrimo(i));
		}
        
        System.out.println("Amigos");
        int j=comprobarAmigos.length-1;
        for (int i = 0; i < j; i++) {
        	System.out.printf("Son amigos %d y %d ? %b\n", 
        			comprobarAmigos[i],
        			comprobarAmigos[j],
        			Mates.sonAmigos(comprobarAmigos[i], comprobarAmigos[j]));
        	j--;
		}
	}

}
