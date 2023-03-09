package clases;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Evento {
    private String descripcion;
    private double precio;
    private String lugar;
    private LocalDate fecha;
    
}
