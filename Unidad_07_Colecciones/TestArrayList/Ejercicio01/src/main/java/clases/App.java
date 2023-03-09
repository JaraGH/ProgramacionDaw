package clases;

import java.time.LocalDate;
import java.util.Optional;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionDatosMeteo g = new GestionDatosMeteo();
		
		g.anadirDatos(new DatosMeteo(15.2, 2.2, 50, 25, 0));
		g.anadirDatos(new DatosMeteo(17.2, 5.2, 55, 25, 1));
		g.anadirDatos(new DatosMeteo(LocalDate.of(2020, 1, 10), 17.2, 5.2, 55, 25, 1));
		g.anadirDatos(new DatosMeteo(LocalDate.of(2020, 1, 11), 17.2, 5.2, 55, 25, 1));
		
		Optional<Double> media = g.mediaTempMax();
		if (media.isEmpty())
			System.out.println("No hay datos");
		else
			System.out.println("Media: " + media.get());
		
		System.out.println("Media Tª máxima enero-2021: " + g.mediaTempMax(1, 2020));
		
	}

}
