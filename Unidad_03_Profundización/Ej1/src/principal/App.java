package principal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Del 1 al 100 con for");
		System.out.println("********************");
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		System.out.println("Del 1 al 100 con while");
		System.out.println("********************");
		int i=1;
		while(i <= 100) {
			System.out.println(i++);
		}
		
		System.out.println("Del 1 al 100 con do-while");
		System.out.println("********************");
		i=1;
		do {
			System.out.println(i);
			i++;
		} while (i<=100);
		
		
		
	}

}
