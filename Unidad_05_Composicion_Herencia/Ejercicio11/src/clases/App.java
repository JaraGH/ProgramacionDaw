package clases;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matriz m = new Matriz(4,4,10,15);
		
		m.imprimirMatriz();
		System.out.println(m.getMaximo());
		System.out.println(m.getMedia());
	}

}
