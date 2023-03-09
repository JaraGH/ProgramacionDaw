package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		
		System.out.printf("Números amigos");
		
//		System.out.println("Teclea dos números enteros:");
//		int n1=entrada.nextInt();
//		int n2=entrada.nextInt();
	
		int n1=220;
		int n2=284;
		
		int sumaDivisoresN1=0;
		for (int i = 1; i <=(n1/2); i++) {
			
			if (n1%i==0) {				
				sumaDivisoresN1+=i;
			}
		}
		
		int sumaDivisoresN2=0;
		for (int i = 1; i <=(n2/2); i++) {
			
			if (n2%i==0) {				
				sumaDivisoresN2+=i;
			}
		}
		
		if (n1==sumaDivisoresN2 && 
				n2==sumaDivisoresN1) {
			System.out.printf("\nLos números %d y %d son amigos", n1,n2);
		} else {
			System.out.printf("\nLos números %d y %d no son amigos", n1,n2);
		}
	}

}
