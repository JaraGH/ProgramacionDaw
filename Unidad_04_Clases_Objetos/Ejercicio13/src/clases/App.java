package clases;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionProductos gestion = new GestionProductos();
		
		gestion.mostrarDiferencia();
		gestion.cambiarPor(new Producto("1000", "Fregona", "herramienta", 5.7, 4.2, 100), 2);
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		gestion.mostrarProductoPosicion(2);
	}

}
