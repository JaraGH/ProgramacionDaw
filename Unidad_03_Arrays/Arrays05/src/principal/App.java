package principal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class App {

	//mostrar nombre y altura del más alto
	//los datos de los arrays están relacionados
	//por la posición que ocupan
	
	public static void main(String[] args) {
	
		
		double [] alturas = {1.56,1.89,1.90,1.75,1.80};
		
		String [] nombres = {"Juan", "Ana", "Eva", "Carlos", "Carmen"};

		
		//int indiceMasAlto=0;
		double masAlto=alturas[0];
		String nombreMasAlto = nombres[0];
		
		for (int i = 1; i < alturas.length; i++) {
			//if (alturas[i]>alturas[indiceMasAlto]) {
			if (alturas[i]>masAlto) {
				//indiceMasAlto=i;
				masAlto = alturas[i];
				nombreMasAlto = nombres[i];
			}
		}
		
		
		//resultado
		//La persona más alta es XXXX y mide YYYY
//		System.out.printf("La persona más alta es %s", nombres[indiceMasAlto]);
//		System.out.printf(" y mide %f", alturas[indiceMasAlto]);
		
		System.out.printf("La persona más alta es %s", nombreMasAlto);
		System.out.printf(" y mide %f", masAlto);
		
	}
	
	

}
