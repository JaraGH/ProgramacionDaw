package clases;

import java.util.Arrays;
import java.util.Random;

public class Matriz implements IMatriz{

	private int [][] m;

	public Matriz(int filas, int columnas, int min, int max) {
		
		this.m = new int[filas][columnas];
		
		Random rnd = new Random();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]= rnd.nextInt(max-min+1)+min;
			}
		}
	}

	@Override
	public void imprimirMatriz() {
		for (int i = 0; i < m.length; i++) {
			
			//mostrar matriz como colección de arrays sencillos
			//System.out.println(Arrays.toString(m[i]));
			
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public int getMaximo() {
		int maximo=m[0][0];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j]>maximo)
					maximo=m[i][j];
			}
		}
		return maximo;
	}

	@Override
	public double getMedia() {
		int suma=0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				suma+=m[i][j];
			}
		}
		return suma/(double)(m.length*m[1].length);
	}
}
