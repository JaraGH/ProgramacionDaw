package principal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] letras = {'a', 'b','c', 'd'};
		
		
		System.out.println("Buscar la c: " 
				+ buscarLetraArray(letras, 'c'));;
				
				System.out.println("Buscar la x: " 
						+ buscarLetraArray(letras, 'x'));;
						
				
		
//		String [] diasSeman = {"lunes", "martes", "miercoles"};
//		
//		int [] v = {10,20,30,40};
//		
//		int [] a = new int[10];
//		
//		int pares=2;
//		Random rnd = new Random();
//		for (int i = 0; i < a.length; i++) {
//			a[i] = rnd.nextInt(51);
//			//a[i]=pares;
//			//pares+=2;
//			System.out.println(a[i]);
//		}
//		
//		System.out.println("Suma array a: " + sumaArray(a));
//		System.out.println("Suma array v: " + sumaArray(v));
//		
//		muestraArrayString(diasSeman);
		
		
		
//		v[0]=100;
//		
//		int aux=v[0];
//		v[0]=v[1];
//		v[1]=aux;
//		
//		for (int i = 0; i < v.length; i++) {
//			System.out.println(v[i]);
//		}
//		
//		System.out.println();
//		for (int i = v.length-1; i >=0; i--) {
//			System.out.println(v[i]);
//		}
		
		
		

	}
	
	//buscar una letra en el array de char
	//retorna la posción donde la encuentra
	//o -1 si no la encuentra
	static int buscarLetraArray(char [] letras, char letraBuscada) {
		
		for (int i = 0; i < letras.length; i++) {
			if (letras[i]==letraBuscada)
				return i;
		}
		
		return -1;
		
	}
	
	
	
	static int sumaArray(int [] a){
		
		int suma=0;
		for (int i = 0; i < a.length; i++) {
			suma+=a[i];
		}
		return suma;
		
	}
	
	static void muestraArrayString(String [] cadenas) {
		for (int i = 0; i < cadenas.length; i++) {
			System.out.println(cadenas[i]);
		}
	}

}
