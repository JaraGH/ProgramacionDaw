package clases;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonaDao {

	private Persona[] personas = new Persona[10];
	private int indice = 0;

	public boolean insertarPersona(Persona p) {
		if (indice == personas.length)
			return false;
		else {
			personas[indice++] = p;
			return true;
		}
	}

	public Persona buscarPersona(String dni) {
		for (Persona persona : personas) {
			if (persona != null && persona.getDni().equals(dni)) {
				return persona;
			}
		}
		return null;
	}

	public int getNumeroPersonas() {
		return indice;
	}

	public void mostrarDatos() {

		for (Persona persona : personas) {
			if (persona != null)
				System.out.println(persona);
		}
	}

	public Persona[] getNPrimerasPersonas(int n) {

		if (n < indice) {
			Persona[] array = Arrays.copyOfRange(personas, 0, n);

			Arrays.sort(array, new Comparator<Persona>() {

				@Override
				public int compare(Persona persona1, Persona persona2) {
					// TODO Auto-generated method stub
					return persona1.getDni().compareTo(persona1.getDni());
				}

			});
			return array;
		} else {
			return null;
		}

	}

	public boolean cambiarPuestoTrabajo(String dni, Trabajo trabajoNuevo) {
		Persona persona = buscarPersona(dni);
		if (persona != null) {
			persona.setPuesto(trabajoNuevo);
			return true;
		} else
			return false;
	}

	public void ordenarDatos() {
		Arrays.sort(personas, new Comparator<Persona>() {

			@Override
			public int compare(Persona persona1, Persona persona2) {
				if (persona1 == null || persona2 == null)
					return 1;
				return persona1.getDni().compareTo(persona2.getDni());
			}

		});
	}

}
