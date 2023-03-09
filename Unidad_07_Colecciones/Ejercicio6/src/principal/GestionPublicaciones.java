/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author profesor
 */
public class GestionPublicaciones {
	
	private Map<String, Publicacion> hash = new HashMap<>();

	public void anadirPublicacion(Publicacion p) {
		if (p != null)
			hash.put(p.getTitulo(), p);
	}

	public boolean eliminarPublicacion(String titulo) {
		//eliminar por key
		Publicacion retorno = hash.remove(titulo);
		
//		if (retorno == null)
//			return false;
//		else
//			return true;
		return (retorno==null)? false: true;
		
	}

	public void listarPublicaciones() {
		Iterator<String> it = hash.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			Publicacion p = hash.get(key);
			System.out.println(p);
		}
	}

	public Integer eliminarVarias(String tipo) {

		Integer contador = 0;
		Iterator<String> it = hash.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			Publicacion p = hash.get(key);
			if (p.getTipo().equalsIgnoreCase(tipo)) {
				it.remove();
				contador++;
			}
		}

		return contador;
	}
	

}
