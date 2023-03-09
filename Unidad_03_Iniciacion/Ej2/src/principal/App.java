package principal;

import java.util.Scanner; //ctrl+shift+o

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final double PI = 3.14159;
		
		System.out.println("Área del circulo");
		
		//entrada
		System.out.println("Radio? "); 
		double radio = entrada.nextDouble();
		
		//proceso de los datos
		double area = PI * Math.pow(radio, 2);
		//double area = PI * radio * radio;
		
		//salida de rtdos
		System.out.println("El área es: " + area);

	}

}
