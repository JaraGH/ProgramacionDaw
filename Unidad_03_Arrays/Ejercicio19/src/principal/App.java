package principal;

import java.text.DecimalFormat;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int [] numeroVeces = new int[6];
		
		for (int i = 1; i <=6000; i++) {
			
			int tirada = rnd.nextInt(6)+1;
						
			numeroVeces[tirada-1]++;
		}
		
		
	
		for (int i=0; i<numeroVeces.length; i++) {
			
			DecimalFormat formateador = new DecimalFormat("####.##");
	
			double porcentaje = numeroVeces[i]*100/6000.0;
			
			System.out.printf("Valor %d, número de veces %d. "
					+ "Porcentaje: %s%%\n", (i+1), numeroVeces[i],
					formateador.format(porcentaje));
		}
	}
}
