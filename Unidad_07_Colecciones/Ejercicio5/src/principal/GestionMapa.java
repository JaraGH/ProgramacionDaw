package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class GestionMapa {

	private Map<String, String> personas = new HashMap<>();

	public GestionMapa() {
		personas.put("11", "Carmen");
		personas.put("23", "Luis");
		personas.put("55", "Ana");
	}
	
	public void ordenarPorKey() {
		
		List<String> keys = new ArrayList<>(personas.keySet());
		
		Collections.sort(keys);
		
		for (String key : keys) {
			System.out.println("Dni: " + key);
			System.out.println("Nombre: " + personas.get(key));
		}
		
	}
	
	public void ordenarPorValor() {
		
		List<Map.Entry<String, String>> todo = new ArrayList<>(personas.entrySet());
		
		
		Collections.sort(todo, new Comparator<Map.Entry<String, String>>(){

			@Override
			public int compare(Entry<String, String> valor1, Entry<String, String> valor2) {
				// TODO Auto-generated method stub
				
				return valor1.getValue().compareTo(valor2.getValue());
			}
			
		});
		for (Entry<String, String> entry : todo) {
			System.out.printf("DNI: %s. Nombre: %s\n", entry.getKey(), entry.getValue());
		}
	}
	
	

	public void nuevo(String dni, String nombre) {
		if (dni!=null && nombre!=null)
			personas.put(dni, nombre);
	}
	
	public void mostrar() {
		for(String key : personas.keySet()) {
			System.out.println("Clave: " + key);
			System.out.println("Valor: " + personas.get(key));
			System.out.println("*********************************");
		}
	}

	
	public boolean buscarValor(String nombre) {
		return personas.containsValue(nombre);
	}

	public boolean buscarKey(String dni) {
		return personas.containsKey(dni);
	}
	
	public String eliminar(String dni) {
		return personas.remove(dni);
	}
	
	
	public Optional<String> eliminarOpt(String dni){
		
		String borrado = personas.remove(dni);
		
		if (borrado==null)
			return Optional.empty();
		else
			return Optional.of(borrado);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
