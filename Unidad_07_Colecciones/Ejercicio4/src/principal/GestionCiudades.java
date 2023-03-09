package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GestionCiudades {
	
	
	private List<Ciudad> arr = new ArrayList<>();

	public GestionCiudades() {
		arr.add(new Ciudad("Zafra", "España", 12000));
		arr.add(new Ciudad("Mérida", "España", 52000));
		arr.add(new Ciudad("Badajoz", "España", 152000));
		arr.add(new Ciudad("Melilla", "España", 102000));
		arr.add(new Ciudad("Lisboa", "Portugal", 1002000));
		arr.add(new Ciudad("Londres", "Inglaterra", 4000000));
	}

	
	
	public List<Ciudad> getArr() {
		return arr;
	}

	
	
	

	public void ordenerPorHabitantes() {
	
		Collections.sort(arr, new Comparator<Ciudad>() {
			@Override
			public int compare(Ciudad city1, Ciudad city2) {
				return city1.getHabitantes().compareTo(city2.getHabitantes());
			}
			
		});
	}
	
	
	public void ordenarPorPais() {		
		Collections.sort(arr, new Comparator<Ciudad>() {

			@Override
			public int compare(Ciudad city1, Ciudad city2) {
				// TODO Auto-generated method stub
				return city1.getPais().compareTo(city2.getPais());
			}
			
		});

	}
	

	public void ordenarPorNombreCiudad(String ascDesc) {
		
		
		final String orden=ascDesc;
		
		Collections.sort(arr, new Comparator<Ciudad>() {

			@Override
			public int compare(Ciudad city1, Ciudad city2) {
				int result = city1.getNombre().compareTo(city2.getNombre());
				
				return (orden.equals("DESC"))? result *-1: result;
			}
			
		});

	}

	
}
