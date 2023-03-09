package principal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionCiudades ciudades = new GestionCiudades();
		
		//ciudades.ordenerPorHabitantes();
		
		//ciudades.ordenarPorNombreCiudad("DESC");
			
		ciudades.ordenarPorPais();
		for (Ciudad ciudad : ciudades.getArr()) {
			System.out.println(ciudad);
		}

	}

}
