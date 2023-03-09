package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuenta los pares tecleados...");
		
		int cuentaPares=0;
		int numero;
		do {
			
			System.out.print("Número ? (-9999 para finalizar) "); 
			numero=entrada.nextInt();
			
			if (numero%2==0)
				cuentaPares++;
			
		} while (numero!=-9999);
		
		
		System.out.printf("\nHas tecleado %d pares", cuentaPares);
		
		
		
		
	}

}
