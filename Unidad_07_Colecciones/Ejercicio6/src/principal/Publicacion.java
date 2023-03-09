/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author profesor
 */
public class Publicacion {
    private String titulo;
    private String tipo;
    private String editorial;
    private String periodicidad;
    private int numeroEjemplares;

    public Publicacion(String titulo, String tipo, String editorial, String periodicidad, int numeroEjemplares) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.editorial = editorial;
        this.periodicidad = periodicidad;
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "titulo=" + titulo + ", tipo=" + tipo + ", editorial=" + editorial + ", periodicidad=" + periodicidad + ", numeroEjemplares=" + numeroEjemplares + '}';
    }    
}
