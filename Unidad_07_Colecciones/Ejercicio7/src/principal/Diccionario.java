package principal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Diccionario {

	private String idioma;

	private Map<String, Set<String>> palabras = new HashMap<>();

	public Diccionario(String idioma) {
		super();
		this.idioma = idioma;
	}
	
	public void addPalabra(String palabra, String significado) {

		if (palabra != null && significado != null)

			if (existePalabra(palabra)) {
				Set<String> sigs = palabras.get(palabra.toLowerCase());
				sigs.add(significado);
				//palabras.get(palabra.toLowerCase()).add(significado);
			} else {
				Set<String> significados = new HashSet<>();
				significados.add(significado);
				palabras.put(palabra, significados);
			}
	}
	
	
	public Set<String> getSignificadosDe(String palabra) {
		return palabras.get(palabra.toLowerCase());
	}
	
	
	//*********************************************************************//
	
	
	public void addPalabra(String palabra, Set<String> significados) {
		if (palabra != null && significados != null) {

			for (String significado : significados) {
				this.addPalabra(palabra, significado);
			}

		}
	}
	
	public void addPalabra(String palabra, String[] significados) {
		this.addPalabra(palabra, new HashSet(Arrays.asList(significados)));
	}

	public void addPalabra(String palabra, String significados, String separador) {
		
		String[] arraySigs = significados.split(separador);
		this.addPalabra(palabra, arraySigs);
	}



	

	private boolean existePalabra(String palabra) {
		return palabras.containsKey(palabra.toLowerCase());
	}

	
}
