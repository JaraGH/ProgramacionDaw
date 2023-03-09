package principal;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 13; i++) {
			System.out.println(getNombreMes(i));
		}
		
	}
	
	static String getNombreMes(int numeroMes) {
		String[] meses={"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};
		if (numeroMes>=1 && numeroMes<=12) {
			return meses[numeroMes-1];
		}
		return "**Error**";
		
	}
		
}
