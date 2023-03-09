package clases;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DatosMeteo {
	private LocalDate fecha;
	private double tempMax;
	private double tempMin;
	private double humedadMax;
	private double humedadMin;
	private double precipitaciones;
	
	public DatosMeteo(double tempMax, double tempMin, double humedadMax, double humedadMin, double precipitaciones) {
		super();
		this.tempMax = tempMax;
		this.tempMin = tempMin;
		this.humedadMax = humedadMax;
		this.humedadMin = humedadMin;
		this.precipitaciones = precipitaciones;
		this.fecha = LocalDate.now();
	}
	
	
}
