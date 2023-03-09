package clases;

public class Pila implements IEstructura {

	private Persona [] pila;
	private int indice=0;
	
	public Pila(int tamanio) {
		pila = new Persona[tamanio];
	}

	public boolean estaVacia() {
		return indice==0;
	}
	
	public Persona primero() {
		return pila[0];
	}

	public Persona extraer() {
		if (indice>0) {
			indice--;
			Persona objeto = pila[indice];
			pila[indice]=null;			
			return objeto;
		}
		return null;
		
	}
	
	public boolean insertar (Persona nuevo) {
		if (indice==pila.length)
			return false;
		else {
			pila[indice++]=nuevo;
			return true;
		}
	}
	
	public void mostrar() {
		for (int i = 0; i < indice; i++) {
			System.out.println(pila[i].toString());
		}
	}

}
