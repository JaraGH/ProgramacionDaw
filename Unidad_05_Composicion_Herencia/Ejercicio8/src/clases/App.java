package clases;

import java.util.Arrays;
import java.util.Scanner;

import productos.ColeccionProductos;
import productos.Fresco;
import productos.Producto;
import productos.Tipos;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada =new Scanner(System.in);

		ColeccionProductos c = new ColeccionProductos(10);
//		
//		Producto [] lista = c.getProductos();
//		for (Producto producto : lista) {
//			System.out.println(producto);
//		}
//		
//		//probar T� congelaci�n
////		System.out.println("Introduce id: "); String id = entrada.next();
////		System.out.println("Introduce T� congelaci�n: "); 
////		double temp = entrada.nextDouble();
////		System.out.println(c.modificarTemperaturaCongelacion(id, temp));
////		
////		for (Producto producto : lista) {
////			System.out.println(producto);
////		}
//		
////		System.out.println("Introduce pais: "); String pais = entrada.next();
////		Fresco [] frescos = c.consultarProductosPorPaisOrigen(pais);
////		for (Fresco fresco : frescos) {
////			System.out.println(fresco);
////		}
//	
//		
//		System.out.println("*************CADUCADOS****************");
//		for (Producto producto : c.consultarProductosCaducados()) {
//			System.out.println(producto.toString());
//		}
//		
		System.out.println("***********************************");
		for (Producto producto : c.obtenerProductosDelTipoEnum(Tipos.CONGELADO)) {
			System.out.println(producto.toString());
		}
		
		
		

//		String[] opciones = { "Menú", "1. Modif. Tª congelación", "2. Productos X país", "3. Productos Caducados",
//				"4. Productos del tipo...", "5. Salir", "Elige opción: " };
//
//		Menu menu = new Menu(opciones);
//		String opcion = "";
//		do {
//			opcion = menu.mostrarMenu();
//			switch (opcion) {
//			case "1":
//
//				for (Producto producto : c.obtenerProductosDelTipo("Congelado")) {
//					System.out.println(producto);
//				}
//				System.out.println("ID? ");
//				String id = entrada.next();
//				System.out.println("Tª? ");
//				double temp = entrada.nextDouble();
//				boolean retorno = c.modificarTemperaturaCongelacion(id, temp);
//				if (retorno)
//					System.out.println("Tª modificada");
//				else
//					System.out.println("Producto no encontrado o no es congelado");
//				break;
//
//			case "2":
//				System.out.println("País? ");
//				String pais = entrada.next();
//				Fresco[] a = c.consultarProductosPorPaisOrigen(pais);
//				System.out.println("Productos del país: " + pais);
//				for (Fresco fresco : a) {
//					System.out.println(fresco);
//				}
//				break;
//
//			case "3":
//				System.out.println("Productos caducados");
//				Producto[] caducados = c.consultarProductosCaducados();
//				for (Producto producto : caducados) {
//					if (producto!=null)
//						System.out.println(producto);
//				}
//				break;
//			case "4":
//				System.out.println("Tipo producto? ");
//				String tipo = entrada.next();
//				Producto[] productosTipo = c.obtenerProductosDelTipoEnum(Tipos.FRESCO);
//				for (Producto producto : productosTipo) {
//					System.out.println(producto);
//				}
//				break;
//			case "5":
//				System.out.println("Fin");
//				break;
//			default:
//				System.out.println("Error en la opción");
//			}
//		} while (!opcion.equals("5"));
	}

}
