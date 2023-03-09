package principal;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class GestionCiudades {

	private Ciudad [] ciudades;
	
	public GestionCiudades() {
		try {
			List<String> lines = Files.readAllLines(Paths.get("ciudades.csv"), 
					StandardCharsets.UTF_8);
			ciudades = new Ciudad[lines.size()];
			int i=0;
			for (String string : lines) {
				ciudades[i] = new Ciudad(string);
				i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Ciudad buscarCiudadPorId(String id) {
		
		//dos opciones
//		for (int i = 0; i < ciudades.length; i++) {
//			if (ciudades[i].getId().equals(id))
//				return ciudades[i];
//		}
//		return null;
		
		for (Ciudad ciudad : ciudades) {
			if (ciudad.getId().equals(id))
				return ciudad;
		}
		return null;
		
	}
	
	public Ciudad ciudadMasPoblada() {
		
//		Ciudad masPoblada = ciudades[0];
//		
//		for (int i = 1; i < ciudades.length; i++) {
//			if (ciudades[i].getPoblacion()>
//					masPoblada.getPoblacion())
//				masPoblada=ciudades[i];
//		}
//		return masPoblada;
		
		boolean primeraVuelta=true;
		Ciudad masPoblada = null;
		for (Ciudad ciudad : ciudades) {
			
			if (primeraVuelta==true) {
				masPoblada=ciudad;
				primeraVuelta=false;
			}else {
				//no es 1ª vez
				if (ciudad.getPoblacion()>masPoblada.getPoblacion())
					masPoblada=ciudad;
			}
			
		}
		return masPoblada;
		
	}
	
	public void mostrarCiudadesDelPais(String pais) {
		for (Ciudad ciudad : ciudades) {
			if (ciudad.getPais().equals(pais))
				System.out.println(ciudad.toString());
		}
	}
	
	public void mostrar() {
		for (Ciudad ciudad : ciudades) {
			System.out.println(ciudad.toString());
		}
	}	
	
	public static boolean comparaCiudades
			(Ciudad c1,Ciudad c2) {
		
		return  c1.equals(c2);
	}
	
	
	//varargs
	public void mostrarVariasCiudades(String... ids) {
		for (String id : ids) {
			Ciudad ciudad = this.buscarCiudadPorId(id);
			if (ciudad!=null)
				System.out.println(ciudad.toString());
			else
				System.out.printf("\nEl %s no corresponde con ninguna ciudad", id);
		}
	}
	
	public void mostrarCiudadesPaises(String...codPaises) {
		//creo un array con varargs
		String [] arrPaises = codPaises;
		//ordeno el array
		Arrays.sort(arrPaises);  //["CN", "FR"]
		
		for (Ciudad ciudad : ciudades) {
			//busco el cód de pais de la ciudad en el array de códigos
			//si el resultado de la busqueda es negativo, el código de
			//ciudad no está en el array, por tanto no es una ciudad buscada
			if (Arrays.binarySearch(arrPaises, ciudad.getCodigoPais())>=0) {
				System.out.println(ciudad.getNombre() + " - " + ciudad.getPais());
			}
		}
		
		//otra forma
//		for (Ciudad ciudad : ciudades) {
//			
//			String pais = ciudad.getCodigoPais();
//			for (String paisPedido : codPaises) {
//				if (pais.equals(paisPedido)) {
//					System.out.println(ciudad.getNombre() + " " 
//							+ ciudad.getCodigoPais());
//				}
//			}
//			
//		}
		
		
		
	}
	
}
