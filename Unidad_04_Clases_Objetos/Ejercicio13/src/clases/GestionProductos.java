package clases;

import java.util.Random;

public class GestionProductos {
	private Producto[] productos = new Producto[100];

	public GestionProductos() {
		Random rnd = new Random();
		String[] tipos = { "pintura", "herramienta", "recambio", "cinta", "envase", "pequeño eletrodoméstico" };
		for (int i = 0; i < productos.length; i++) {
			productos[i] = new Producto("00" + i, "Pro" + i, tipos[rnd.nextInt(tipos.length)], 3.04 * rnd.nextInt(10),
					2.04 * rnd.nextInt(10), 150 + i);
		}
	}

	public void filtrarPorPrecioVenta(double precio) {
		System.out.println("Productos con precio superior a " + precio);
		System.out.println("*******************************************");
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null && productos[i].getPrecioVenta() > precio)
				System.out.println(productos[i]);
		}
	}

	public void filtrarPorTipo(String tipo) {
		System.out.println("Productos del tipo " + tipo);
		System.out.println("*******************************************");
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null && productos[i].getTipo().equalsIgnoreCase(tipo))
				System.out.println(productos[i]);
		}
	}

	public void mostrarDiferencia() {
		System.out.println("Productos con diferencia entre precio de venta y compra");
		System.out.println("*******************************************************");
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null)
				System.out.println("Producto: " + productos[i].getNombre() + 
						"\nPrecio Venta: " + productos[i].getPrecioVenta() +
						"\nPrecio Compra: " + productos[i].getPrecioCompra() +
						"\nDiferencia: " + (productos[i].getPrecioVenta() - productos[i].getPrecioCompra()));
				System.out.println("*********************************");
		}
	}
	
	public void mostrarProductoPosicion(int  posicion) {
		System.out.println("Producto en la posicion: " + posicion);
		System.out.println("*************************************");
		if (posicion>0 && posicion<productos.length) {
			System.out.println("Producto: " + productos[posicion].getNombre() + 
					"\nPrecio Venta: " + productos[posicion].getPrecioVenta() +
					"\nPrecio Compra: " + productos[posicion].getPrecioCompra() +
					"\nDiferencia: " + (productos[posicion].getPrecioVenta() - productos[posicion].getPrecioCompra()));
			System.out.println("*********************************");
		} else {
			System.out.println("Posición errónea");
		}
			
	}
	
	public boolean cambiarPor (Producto producto, int posicion) {
		if (posicion>0 && posicion<productos.length) {
			productos[posicion] = producto;
			return true;
		} else {
			return false;
		}
	}

}
