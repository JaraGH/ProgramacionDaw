package principal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		if (n>=1 && n<=100) {
			String [] values = new String[n];

			for (int i = 0; i < n; i++) {
				values[i] = sc.nextLine();				
			}
			
			
			//ordenar
			Arrays.sort(values, new Comparator<String>() {

				@Override
				public int compare(String arg0, String arg1) {
					BigDecimal n1 = new BigDecimal(arg0);
					BigDecimal n2 = new BigDecimal(arg1);
					
					int retorno = n1.compareTo(n2);
					//retornar 1 implica que n1 es mayor
					return (retorno==0)? 1: retorno*-1;
				}
				
			});
			
			System.out.println(Arrays.toString(values));
		}
	}

}
