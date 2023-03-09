package principal;

import java.util.Arrays;
import java.util.Comparator;

public class OrdenarPersonas {

	public static void ordenar (Persona [] array, String ordenarPor) {
		if (ordenarPor.equalsIgnoreCase("nombre"))
			ordenaPornombre(array);
		else if (ordenarPor.equalsIgnoreCase("fecha"))
			ordenaPorFecha(array);
		else if (ordenarPor.equalsIgnoreCase("id"))
			ordenaPorId(array);
	}
	
	private static void ordenaPornombre(Persona [] array) {
		Arrays.sort(array, new Comparator<Persona>() {

			@Override
			public int compare(Persona arg0, Persona arg1) {
				// TODO Auto-generated method stub
				return arg0.getNombre().compareTo(arg1.getNombre());
			}
			
		});
	}

	private static void ordenaPorFecha(Persona [] array) {
		//ordenar por fecha
		Arrays.sort(array, new Comparator<Persona>() {

			@Override
			public int compare(Persona arg0, Persona arg1) {
				// TODO Auto-generated method stub
				return arg0.getFechaNacimiento().compareTo(arg1.getFechaNacimiento());
			}
			
		});		
		
	}
	
	private static void ordenaPorId(Persona [] array) {
		//ordenar por id
		Arrays.sort(array, new Comparator<Persona>() {

			@Override
			public int compare(Persona arg0, Persona arg1) {
				// TODO Auto-generated method stub
				Integer id1 = arg0.getId();
				Integer id2 = arg1.getId();
				return id1.compareTo(id2);
			}
			
		});
	}
	
	
	//otra forma
	public static void ordenarPorCampo (Persona [] array, String ordenarPor) {
		Arrays.sort(array, new Comparator<Persona>() {

			@Override
			public int compare(Persona arg0, Persona arg1) {
				// TODO Auto-generated method stub
				if (ordenarPor.equalsIgnoreCase("nombre"))
					return arg0.getNombre().compareTo(arg1.getNombre());
				else if (ordenarPor.equalsIgnoreCase("id")) {
					Integer id1 = arg0.getId();
					Integer id2 = arg1.getId();
					return id1.compareTo(id2);						
				} else 
					return arg0.getFechaNacimiento().compareTo(arg1.getFechaNacimiento());
			}
			
		});
	}
	

			

			
}
