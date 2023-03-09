package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class GestionDatosMeteo {

	List<DatosMeteo> datos = new ArrayList<>();
	
	public void anadirDatos(DatosMeteo nuevo) {
		if (nuevo!=null) {
			datos.add(nuevo);
		}
	}
	
	public Optional<Double> mediaTempMax() {
		Double suma = 0.0;
		
		if (datos.isEmpty()) {
			//lista vacía
			return Optional.empty();
		} else {
			for (DatosMeteo datosMeteo : datos) {
				suma += datosMeteo.getTempMax();
			}	
			return Optional.of(suma / datos.size());
		}
		
	}

	public Double mediaTempMax(int mes, int anio) {
		Double suma = 0.0;
		int cuenta = 0;
		for (DatosMeteo datosMeteo : datos) {
			if (datosMeteo.getFecha().getMonthValue() == mes 
					&& datosMeteo.getFecha().getYear() == anio) {
				suma += datosMeteo.getTempMax();
				cuenta++;
			}
		}
		if (!datos.isEmpty())
			return suma / cuenta;
		else
			return null; 
	}

	public Integer numeroRegistros() {
		return datos.size();
	}
	
}
