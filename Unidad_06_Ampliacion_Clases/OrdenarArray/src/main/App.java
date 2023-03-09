package main;

import java.util.Arrays;
import java.util.Comparator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente [] clientes = {
			new Cliente("1", "Carmen", "Robles"),
			new Cliente("422", "Luis", "Díaz"),
			new Cliente("3", "Ana", "Romero"),
			new Cliente("4", "Ana", "Casas")
		};
		
//		Arrays.sort(clientes);
		
		Arrays.sort(clientes, new Comparator<Cliente>() {

			@Override
			public int compare(Cliente cliente1, Cliente cliente2) {
				// TODO Auto-generated method stub
				return cliente1.getId().compareTo(cliente2.getId());
			}
			
		});
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

}
