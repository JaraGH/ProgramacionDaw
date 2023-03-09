package principal;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class GestionProductos {
	
	private List<Producto> productos = new ArrayList<>();
	
	public void nuevoProducto(Producto producto) {
		if (producto!=null)
			productos.add(producto);
	}
	
	public boolean eliminarProducto(String id) {
		
		//con foreach
		for (Producto producto : productos) {
			if (producto.getIdProducto().equalsIgnoreCase(id)) {
				productos.remove(producto);
				return true;
			}
		}
		
		//idem que arriba con for
//		for (int i = 0; i < productos.size(); i++) {
//			if (productos.get(i).getIdProducto().equalsIgnoreCase(id)) {
//				productos.remove(i);
//				return true;
//			}
//		}
		
		return false;
	}
	
			
	public List<Producto> getProductos(){
		return productos;
	}
	
	public List<Producto> getProductosDelTipo(String tipo){
		
		List<Producto> arrayRetorno = new ArrayList<>();
		
		for (Producto producto : productos) {
			if ((tipo.equalsIgnoreCase("F") && producto instanceof Fresco) || 
				(tipo.equalsIgnoreCase("C") && producto instanceof Congelado) ||
				(tipo.equalsIgnoreCase("R") && producto instanceof Refrigerado))
				arrayRetorno.add(producto);
		}
		return arrayRetorno;
		
//		return productos
//				.stream()
//				.filter((Producto p) -> {
//					if ((tipo.equalsIgnoreCase("F") && p instanceof Fresco) ||
//						(tipo.equalsIgnoreCase("C") && p instanceof Congelado) ||
//						(tipo.equalsIgnoreCase("R") && p instanceof Refrigerado))
//						return true;
//					else
//						return false;
//				})
//				.collect(Collectors.toList());
		
	}
	
	public int eliminarCongelados() {
//		exception del tipo Concurrent....
//		int contador=0;
//		for (Producto producto : productos) {
//			if (producto instanceof Congelado) {
//				productos.remove(producto);
//				contador++;
//			}
//		}
//		return contador;
		
		int contador=0;
		
		Iterator<Producto> it = productos.iterator();
		
		while (it.hasNext()) {
			Producto pro =  it.next(); //dame siguiente
			if (pro instanceof Congelado) {
				it.remove();
				contador++;
			}
		}
		return contador;
		
	}
	
}
