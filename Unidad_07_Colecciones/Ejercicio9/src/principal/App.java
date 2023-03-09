/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author profesor
 */
public class App {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		GestionMultas g = new GestionMultas();
		
//		g.mostrarMultasOrdenadasPorMatricula();
		
		
		
		// Obtener resumen
		HashMap<String, ResumenMultas> resumenMultas = g.getResumenMultas();
		
		//mostrar resumen
		System.out.println("\n\n*********************************");
		System.out.println("**********Resumen multas*************");
		System.out.println("*************************************");
		for (String matricula : resumenMultas.keySet()) {
			System.out.println(resumenMultas.get(matricula));
		}
//		
	}



}
