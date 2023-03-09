package principal;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestionProductos g = new GestionProductos();

		g.nuevoProducto(new Fresco(LocalDate.now().minusDays(5), "Espa�a", "0001f", "Fresco01",
				LocalDate.now().plusDays(10), 100));
		g.nuevoProducto(new Fresco(LocalDate.now().minusDays(5), "Espa�a", "0002f", "Fresco02",
				LocalDate.now().plusDays(10), 100));
		
		g.nuevoProducto(new Congelado(-12.5, "0001c", "Congelado01", LocalDate.now().plusYears(2), 100));
		g.nuevoProducto(new Congelado(-12.5, "0002c", "Congelado02", LocalDate.now().plusYears(2), 100));

		g.nuevoProducto(new Refrigerado("000Ref01", "0001r", "Refrigerado01", LocalDate.now().plusYears(2), 100));
		g.nuevoProducto(new Refrigerado("000Ref01", "0002r", "Refrigerado02", LocalDate.now().plusYears(2), 100));

		// mostrar
//		System.out.println("************Todos**********");
//		for (Producto producto : g.getProductos()) {
//			System.out.println(producto);
//		}
		// eliminar congelados
//		g.eliminarCongelados();
//
		// mostrar
//		System.out.println("************Todos**********");
//		for (Producto producto : g.getProductos()) {
//			System.out.println(producto);
//		}
//		
		//mostrar frescos
		System.out.println("*********FRESCOS************");
		for (Producto producto : g.getProductosDelTipo("F")) {
			System.out.println(producto.toString());
		}

	}

}
