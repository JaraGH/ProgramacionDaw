package principal;


import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Día de la semana");
		System.out.println("****************");
		
		System.out.print("Teclea un nº entre 1 y 7");
		
		int dia = entrada.nextInt();
		
		if (dia==1) {
			System.out.printf("El día %d es lunes", dia);
		} else if (dia==2) {
			System.out.printf("El día %d es martes", dia);
		} else if (dia==3) {
			System.out.printf("El día %d es miércoles", dia);
		} else if (dia==4) {
			System.out.printf("El día %d es jueves", dia);
		} else if (dia==5) {
			System.out.printf("El día %d es viernes", dia);
		} else if (dia==6) {
			System.out.printf("El día %d es sábado", dia);
		} else if (dia==7){
			System.out.printf("El día %d es domingo", dia);
		} else {
			System.out.printf("Error en el día");
		}	
		
		switch (dia) {
		case 1:
			System.out.printf("El día %d es lunes", dia);
			break;
		case 2:
			System.out.printf("El día %d es martes", dia);
			break;
		default:
			System.out.println("Error en el día");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
