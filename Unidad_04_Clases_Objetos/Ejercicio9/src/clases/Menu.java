package clases;

import java.util.Scanner;

public class Menu {
	
	private String [] opciones;

	public Menu(String[] opciones) {
		this.opciones = opciones;
	}
	
	public String mostrarMenu() {
		Scanner entrada = new Scanner(System.in);
		// mostrar opciones menu
		for (String string : opciones) {
			System.out.println(string);
		}
		String opc = entrada.next();
		return opc;
	}
	
}
