package principal;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String[] meses={"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};
		
		for (int i = 0; i < meses.length; i++) {
			System.out.println(meses[i] + "---> " + meses[i].length());
		}
		
	}
	
}
