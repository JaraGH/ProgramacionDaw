package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> masNumeros = Arrays.asList(10,20,30,40);
		List<Integer> numeros = new ArrayList<>();
		

		
		
		numeros.add(1);
		numeros.add(1234);
		numeros.addAll(masNumeros);
		
		for (Integer valor : numeros) {

			System.out.println(valor);
		}
		System.out.println("*****************");
//		numeros.remove(0);
//		numeros.clear();
//		for (int i = 0; i < numeros.size(); i++) {
//			System.out.println(numeros.get(i));
//		}
		
		//eliminar pares del arrayList
		Iterator<Integer> iterador = numeros.iterator();
		while (iterador.hasNext()) {
			Integer n = iterador.next();
			if (n%2==0)
				iterador.remove();
		}
		
		System.out.println(numeros.toString());
		
//		for (Integer valor : numeros) {
//
//			System.out.println(valor);
//		}
	}

}
