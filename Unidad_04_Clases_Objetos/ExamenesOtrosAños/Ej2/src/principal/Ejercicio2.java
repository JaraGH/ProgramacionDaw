/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author jose
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp1 = new Empleado("80137039W", "Ana Guzmán Silva");
        Empleado emp2 = new Empleado("90337039W", "Andrés Lima Silva",1000.0,20.0,
                "Soltero",50.0,0);
        Empleado emp3 = new Empleado("33137039W", "Eva Robles Sal",1300.0,21.0,
                "Soltera",10.0,0);
        
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        
        emp1.setSueldoBruto(1000);;
        System.out.println(emp1.toString());
        
        System.out.println(emp2.toString());
        System.out.println("Sueldo neto: " + emp2.getSueldoNeto());
        System.out.println("Importe 10 horas extra: " + emp2.getImporteHorasExtra(10));
        
    }
    
}
