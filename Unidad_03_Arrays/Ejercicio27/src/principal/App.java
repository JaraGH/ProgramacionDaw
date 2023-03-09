package principal;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		String [][] alumnos = getAlumnos();
		int [][] notas =  getNotas();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Teclea DNI: ");
		
		String dni = entrada.next();
		
		
		int fila = buscarAlumnoPorDni(dni,alumnos);
		//fila = -1 no encontrado
		if (fila==-1) {
			System.out.println("El alumno con ese DNI no existe");
		} else {
			System.out.println("DNI: " + alumnos[fila][0]);
			System.out.println("Nombre: " + alumnos[fila][1]);
			System.out.println("\nNotas:");
			
			for (int i = 0; i < notas[fila].length; i++) {
				System.out.print("Examen " +(i+1) + ": ");
				imprimeAsteriscos(notas[fila][i]);
				System.out.print(notas[fila][i]);
				if (notas[fila][i]<5)
					System.out.println(" Suspenso");
				else
					System.out.println();
			}
			
		}
		
		
		
		
	}
	
	static void imprimeAsteriscos(int nota) {
		for (int i = 1; i <=nota; i++) {
			System.out.print("*");
		}
		System.out.print(" ");
	}
	
	
	

	static int buscarAlumnoPorDni(String dniBuscado, 
			String [][] alumnos) {
										
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i][0].equals(dniBuscado))
				return i;
		}
		return -1;
		
	}

	static String [][] getAlumnos(){
		String [][] alumnos = {
				{"8888999X", "Luis Arrimadas"},
				{"4444443F", "Lucía Casas"},
				{"4866668A", "Fran Cuesta"},
				{"4838383F", "Iker Casillas"},
				{"4838383F", "Pedro del Hierro"},
				{"4838383F", "Luis Casimiro"},
				{"4838383F", "Antonia Río"},
				{"4838383F", "Silvia Gómez"},
				{"4838383F", "Camila López"},
				{"4838383F", "Laura Ruiz"}
				
		};
		return alumnos;
		
	}
	
	static int [][] getNotas(){
		int [][] notas = new int [10][3];
		Random rnd = new Random();
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				notas[i][j] = rnd.nextInt(10)+1;
			}
		}
		return notas;
	}
	
}
