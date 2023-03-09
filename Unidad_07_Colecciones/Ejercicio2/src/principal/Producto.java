package principal;

import java.time.LocalDate;

;

/**
 *
 * @author: idproducto, descripcion, fecha de caducidad y n�mero de lote profesor
 */
public abstract class  Producto {
    private String idProducto;
    private String descripcion;
    private LocalDate fechaCad;
    private int lote;

    public Producto(String idProducto, String descripcion, LocalDate fechaCad, int lote) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.fechaCad = fechaCad;
        this.lote = lote;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(LocalDate fechaCad) {
        this.fechaCad = fechaCad;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", descripcion=" + descripcion + ", fechaCad=" + fechaCad + ", lote=" + lote + '}';
    }
    
    
    
}
