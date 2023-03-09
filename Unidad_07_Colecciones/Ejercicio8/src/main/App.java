package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// generar 10 números al azar
		List<Integer> numeros = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Random rnd = new Random();
			numeros.add(rnd.nextInt(1, 10));
		}

		// contar
		Map<Integer, Integer> contadores = new HashMap<>();

		for (Integer integer : numeros) {
			if (contadores.containsKey(integer)) {
				contadores.put(integer, contadores.get(integer) + 1);
			} else {
				contadores.put(integer, 1);
			}
		}

		// ordenar
		List<Integer> listaContadores = new ArrayList<>(contadores.keySet());
		listaContadores.sort(Comparator.naturalOrder());

		// mostrar resultado
		System.out.println("Números generados: " + numeros.toString());
		System.out.println("*******************************************");
		for (Integer key : listaContadores) {
			System.out.printf("Valor: %d. Aparece %d veces. \n", key, contadores.get(key));
		}

	}

}
