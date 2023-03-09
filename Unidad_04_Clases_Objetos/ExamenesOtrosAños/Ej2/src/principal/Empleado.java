/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**

 * @author jose
 */
public class Empleado {
    private String nif;
    private String nombre;
    private double sueldoBruto;
    private double pagoHoraExtra;
    private String estadoCivil;
    private double irpf;
    private int numeroHijos;

    public Empleado(String nif, String nombre, double sueldoBruto, double pagoHoraExtra, String estadoCivil, double irpf, int numeroHijos) {
        this.nif = nif;
        this.nombre = nombre;
        this.sueldoBruto = sueldoBruto;
        this.pagoHoraExtra = pagoHoraExtra;
        this.estadoCivil = estadoCivil;
        this.irpf = irpf;
        this.numeroHijos = numeroHijos;
    }

    public Empleado(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

    public double getImporteHorasExtra(int horas){
        return horas*pagoHoraExtra;
    }
    
    public double getSueldoNeto(){
        return sueldoBruto-(sueldoBruto*irpf/100);
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "nif=" + nif + ", nombre=" + nombre + ", sueldoBruto=" + sueldoBruto + ", pagoHora=" + pagoHoraExtra + ", estadoCivil=" + estadoCivil + ", irpf=" + irpf + ", numeroHijos=" + numeroHijos + '}';
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public double getPagoHora() {
        return pagoHoraExtra;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHoraExtra = pagoHora;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }
    
    
    
}
