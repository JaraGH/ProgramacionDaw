package principal;

import java.text.DecimalFormat;
import java.util.Iterator;

public class App {

	
	public static void main(String[] args) {
		
		for (int numero=1;numero<=13;numero++) {
			
			System.out.printf("\nEl mes %d es %s", 
					numero, nombreMes(numero));
		}
		
	}
	
	
	static String nombreMes(int numeroMes) {
		
		String nombre= switch (numeroMes) {
		case 1: {yield "Enero";}
		case 2: {yield "Febrero";}
		case 3: {yield "Marzo";}
		case 4: {yield "Abril";}
		case 5: {yield "Mayo";}
		case 6: {yield "Junio";}
		case 7: {yield "Julio";}
		case 8: {yield "Agosto";}
		case 9: {yield "Septiembre";}
		case 10: {yield "Octubre";}
		case 11: {yield "Noviembre";}
		case 12: {yield "Diciembre";}
		default: yield "Error";
		
		};
		return nombre;
	}
}
