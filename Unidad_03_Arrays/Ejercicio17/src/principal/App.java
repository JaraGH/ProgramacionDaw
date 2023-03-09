package principal;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		int [] tipoMoneda= {500, 200, 100, 50, 20, 10, 5, 2, 1};
		
		int cantidad = 1231;//231
		for (int i = 0; i < tipoMoneda.length; i++) {
			int numero = cantidad/tipoMoneda[i];
			cantidad = cantidad%tipoMoneda[i];
			String billeteMoneda="";
			if (tipoMoneda[i]>=5)
				billeteMoneda="billetes";
			else
				billeteMoneda="monedas";
			System.out.println(numero + " " + billeteMoneda +  " de " + tipoMoneda[i]);
		}
		
	}
		
}
