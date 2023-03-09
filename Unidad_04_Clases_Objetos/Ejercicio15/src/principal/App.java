package principal;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		
		GestionCiudades g = new GestionCiudades();
		
//		g.mostrar();
		
		g.mostrarCiudadesPaises("FR", "CN", "US");
		
//		Ciudad c1 = g.buscarCiudadPorId("19");
		
//		Ciudad c2 = g.buscarCiudadPorId("200");
//		
//		System.out.println(c1.toString());
//		System.out.println(c2.toString());
//		System.out.println(GestionCiudades.comparaCiudades(c1, c1));
//		System.out.println(GestionCiudades.comparaCiudades(c1, c2));
	}

}
