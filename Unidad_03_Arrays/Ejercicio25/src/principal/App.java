package principal;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		String [] alumnos = new String[20];
		double [][] notas = new double[20][3];
		
		//cargar datos en arrays
		Random rnd = new Random();
		System.out.println("Primera parte: alumnos con notas");
		for (int i = 0; i < notas.length; i++) {
			
			alumnos[i]="Alumno-"+i;
			
			System.out.print(alumnos[i] + ". Notas: ");
			for (int j = 0; j < notas[i].length; j++) {
				notas[i][j]=rnd.nextDouble()*10+1;
				System.out.printf("%5.2f ", notas[i][j]);
			}
			System.out.println();
		}
		
		
		//mostrar media de notas
		System.out.println("\n\nSegunda parte: alumnos con medias");
		for (int i = 0; i < notas.length; i++) {
			double suma=0;
			for (int j = 0; j < notas[i].length; j++) {
				suma+=notas[i][j];
			}
			double media = suma/notas[i].length;
			System.out.printf("\nNombre: %s, media notas: %5.2f", alumnos[i], media);
		}
	}	
	
	
}
