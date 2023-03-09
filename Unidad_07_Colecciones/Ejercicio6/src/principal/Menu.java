/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Menu {
private String [] opciones;

    public Menu(String[] opciones) {
        this.opciones = opciones;
    }
    
    public String mostrarMenu(){
        Scanner entrada = new Scanner(System.in);
        String opcion="";
        for (int i = 0; i < opciones.length; i++) {
            System.out.println(opciones[i]);
        }
        opcion=entrada.next();
        return opcion;
    }    
}
