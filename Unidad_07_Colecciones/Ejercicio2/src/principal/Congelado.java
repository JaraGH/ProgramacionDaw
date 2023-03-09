/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

import java.time.LocalDate;

/**
 *
 * @author profesor
 */
public class Congelado extends Producto{
    private double temperaturaCon;

    public Congelado(double temperaturaCon, String idProducto, String descripcion, LocalDate fechaCad, int lote) {
        super(idProducto, descripcion, fechaCad, lote);
        this.temperaturaCon = temperaturaCon;
    }

    public double getTemperaturaCon() {
        return temperaturaCon;
    }

    public void setTemperaturaCon(double temperaturaCon) {
        this.temperaturaCon = temperaturaCon;
    }

    @Override
    public String toString() {
        return super.toString() + " Congelado{" + "temperaturaCon=" + temperaturaCon + '}';
    }
    
    
}
