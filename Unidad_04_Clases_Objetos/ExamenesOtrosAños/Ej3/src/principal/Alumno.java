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
public class Alumno {
    private int numero;
    private String nombre;
    private String apellidos;
    private double [] notas = new double[10];

    public Alumno(int numero, String nombre, String apellidos, double [] notas) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.notas = notas;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public double obtenerNotaMedia(){
        double suma=0;
        for (int i = 0; i < notas.length; i++) {
            suma+=notas[i];
        }
        return suma/notas.length;
    }
    
    public int contarAprobados(){
        int cuentaA=0;
        for (int i = 0; i < notas.length; i++) 
            if (notas[i]>=5)
                cuentaA++;
        return cuentaA;
    }
   
    public int contarSuspensos(){
        return this.notas.length- this.contarAprobados();
    }
    
    public String getDatos(){
        return this.nombre + " " + this.apellidos +" " + this.obtenerNotaMedia();
    }
}
