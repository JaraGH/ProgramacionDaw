package principal;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		
		double [][] m = new double[4][5];
		
		
		
		DecimalFormat formato = new DecimalFormat("000.00");
		
		//llenar y mostrar
		for (int i = 0; i < m.length; i++) {
			
			System.out.printf("Fila %d--> ", i);
			for (int j = 0; j < m[i].length; j++) {
				
				m[i][j]=rnd.nextDouble()*100;
				
				System.out.printf("%s ", formato.format(m[i][j]));
			}
			System.out.println();
		}
		
		Scanner entrada = new Scanner(System.in);
		System.out.printf("\nIntroduce fila, de 0 a %d: ", m.length);
		int fila = entrada.nextInt();
		
		if (fila>=0 && fila<m.length) {
				
			System.out.printf("Fila %d--> ", fila);
			double sumaFila=0;
			for (int j=0; j<m[fila].length;j++) {				
				System.out.printf("%s ", formato.format(m[fila][j]));
				sumaFila+=m[fila][j];		
			}
			System.out.printf("\nSuma fila: %s", formato.format(sumaFila));
		} else {
			System.out.println("Error, la fila no es correcta.");
		}
	}	
}
