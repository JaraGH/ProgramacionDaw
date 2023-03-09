package productos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ColeccionProductos {
	Producto[] listaP;

	public ColeccionProductos(int numeroProductos) {

		listaP = new Producto[numeroProductos];

		for (int i = 0; i < listaP.length; i++) {
			String id = "00000" + i;
			String descripcion = "Producto-" + i;
			LocalDate fechaC = LocalDate.of(2023, 2, 13);
			int lote = 123422 * i;
			int tipo = (int) (Math.random() * 3);
			switch (tipo) {
			case 0:
				// Congelado
				double tempC = -5.0 * i;
				listaP[i] = new Congelado(tempC, id, descripcion, fechaC, lote);
				break;
			case 1:
				// Refrigerado
				String codigo = "ABC-" + i;
				listaP[i] = new Refrigerado(codigo, id, descripcion, fechaC, lote);
				break;
			case 2:
				// Fresco
				LocalDate fechaE = LocalDate.now();
				fechaE.minusDays(5);
				String[] paises = { "España", "Italia", "Marruecos", "Argelia", "Francia" };
				String paisO = paises[(int) (Math.random() * 5)];
				listaP[i] = new Fresco(fechaE, paisO, id, descripcion, fechaC, lote);

			}
		}
		// Hago caducar el primer producto
		listaP[0].setFechaCad(LocalDate.now().minusDays(30));
	}

	// retornar array de productos
	public Producto[] getProductos() {
		return listaP;
	}

	// modificar Tª de congelacion de un producto buscando por su id
	public boolean modificarTemperaturaCongelacion(String id, double temp) {
		for (Producto producto : listaP) {
			if (producto.getIdProducto().equals(id)) {
				if (producto instanceof Congelado) {
					Congelado congelado = (Congelado) producto;
					congelado.setTemperaturaCon(temp);
					return true;
				} else { // no es congelado
					return false;
				}
			}
		}
		return false; // id no encontrada

	}

	// retornar array de frescos de un pa�s concreto
	public Fresco[] consultarProductosPorPaisOrigen(String paisBuscado) {

		Fresco[] frescos = new Fresco[listaP.length];
		int indice = 0;
		for (Producto producto : listaP) {
			if (producto instanceof Fresco
					&& ((Fresco) producto).getPaisOrigen().equalsIgnoreCase(paisBuscado)) {
				frescos[indice++] = (Fresco) producto;
			}
		}
		return Arrays.copyOfRange(frescos, 0, indice);
	}

	// retornar array de productos caducados
	public Producto[] consultarProductosCaducados() {
		Producto[] caducados = new Producto[listaP.length];
		int indice = 0;
		for (Producto producto : listaP) {
			// fecha caducidad es anterior a la que tiene el ordenador LocalDate.now()
			if (producto.getFechaCad().isBefore(LocalDate.now()))
				caducados[indice++] = producto;
		}
		return Arrays.copyOfRange(caducados, 0, indice);
	}

	// obtener array de productos de un tipo
	// tipo: F, fresco C, congelado R, refrigerado
	public Producto[] obtenerProductosDelTipo(String tipo) {

		Producto[] productos = new Producto[listaP.length];
		int indice = 0;
		for (Producto producto : listaP) {
			if ((tipo.equalsIgnoreCase("R") && producto instanceof Refrigerado)
					|| (tipo.equalsIgnoreCase("C") && producto instanceof Congelado)
					|| (tipo.equalsIgnoreCase("F") && producto instanceof Fresco))
				productos[indice++] = producto;
		}

		return Arrays.copyOfRange(productos, 0, indice);

	}

	public Producto[] obtenerProductosDelTipoEnum(Tipos tipo) {

		Producto[] productos = new Producto[listaP.length];
		int indice = 0;
		for (Producto producto : listaP) {
			if ((tipo==Tipos.REFRIGERADO && producto instanceof Refrigerado)
					|| (tipo==Tipos.CONGELADO && producto instanceof Congelado)
					|| (tipo==Tipos.FRESCO && producto instanceof Fresco))
				productos[indice++] = producto;
		}

		return Arrays.copyOfRange(productos, 0, indice);

	}
	
	

}
