package clases;

import java.util.Arrays;
import java.util.Random;

public class GestionNumeros implements InterfazNumeros {

	private int [] numeros  = new int[10];
	
	public GestionNumeros() {
		Random rnd = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=rnd.nextInt(10);
		}
	}

	
	
	public GestionNumeros(int[] numeros) {
		super();
		this.numeros = numeros;
	}



	@Override
	public void mostrarNumeros() {
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
	}

	@Override
	public void mostrarNumerosComoString() {
		System.out.println(Arrays.toString(numeros));
		
	}

	@Override
	public void multiplicaPor(int numero) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]*=numero;
		}
		
	}

	@Override
	public int contarValoresMayoresQue(int numero) {
		int contador=0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]>numero)
				contador++;
		}
		return contador;
	}

	@Override
	public int contarValoresEntre(int numero1, int numero2) {
		int contador=0;
		if (numero1>numero2) {
			int aux=numero1;
			numero1=numero2;
			numero2=aux;
		}
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]>=numero1 && numeros[i]<=numero2)
				contador++;
		}
		return contador;
	}

	@Override
	public int sumarElementos(int[] otroArray) {
		return sumaArray(this.getArray(otroArray));
	}

	@Override
	public int[] getArray(int[] otroArray) {
		if (this.numeros.length>otroArray.length)
			return this.numeros;
		else
			return otroArray;
	}
	
	private int sumaArray(int [] a) {
		int suma=0;
		for (int i = 0; i < a.length; i++) {
			suma+=a[i];
		}
		return suma;
	}

}
