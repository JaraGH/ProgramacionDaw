package principal;

import java.util.Random;

public class App {

	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
				System.out.printf("\nValor entre %d y %d: %d", 
						4, 60, dameAleatorioEntre(4, 60));	
		}
		
		
	}
	
	
	static int dameAleatorioEntre(int menor, int mayor) {
		
		Random rnd = new Random();
		
		
		if (menor>mayor) {
			int aux=mayor;
			mayor=menor;
			menor=aux;
		}
		
		int diferencia = mayor-menor; 
		return rnd.nextInt(diferencia+1) + menor;
	
		
	}
	
	
	
	
	
	
}
