/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *
 * @author jose
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] notas1 = {10, 1, 2.4, 5,5.6, 7, 6.2, 9.0, 8.2, 9.1};
        double [] notas2 = {6, 7, 2.4, 5,5.6, 7, 6.2, 9.0, 8.2, 9.1};
        
        DecimalFormat formato = new DecimalFormat("##.###");
        Alumno a1 = new Alumno (1, "Paco", "López", new double[] {10, 9.1});
        Alumno a2 = new Alumno (2, "Ana", "Casimiro", notas2);
     
        System.out.println(a1.getNombre() + " \\Nota media: " + formato.format(a1.obtenerNotaMedia()) + "\\");
        System.out.println(a2.getNombre() + " \\Nota media: " + formato.format(a2.obtenerNotaMedia()) + "\\");
        if (a1.obtenerNotaMedia()>a2.obtenerNotaMedia())
            System.out.println("La nota media de " + a1.getNombre() + " es mayor. Tiene: " + formato.format(a1.obtenerNotaMedia()));
        else if (a1.obtenerNotaMedia()==a2.obtenerNotaMedia())
            System.out.println("Las medias son iguales" + a1.obtenerNotaMedia());
        else
            System.out.println("La nota media de " + a2.getNombre() + " es mayor. Tiene: " + formato.format(a2.obtenerNotaMedia()));
        
        System.out.println("Las notas de " + a1.getNombre() + ": " + Arrays.toString(a1.getNotas()));
        System.out.println("\\Aprobados\\ " + a1.contarAprobados());
        System.out.println("\\Suspensos\\ " + a1.contarSuspensos());
        
    }
        
    
}
