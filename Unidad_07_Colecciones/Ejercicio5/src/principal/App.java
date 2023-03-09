package principal;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		GestionMapa g = new GestionMapa();
		
//		System.out.println(g.eliminar("1111"));
//		System.out.println(g.eliminarOpt("1111"));
		
		g.nuevo("44", "Angel");
		//g.ordenarPorKey();
		g.ordenarPorValor();
		
		
	}

}
