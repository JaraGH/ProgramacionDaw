package clases;


public class Cola implements IEstructura {

	private Persona [] cola;
	private int indice=0;
	
	public Cola(int tamanio) {
		cola = new Persona[tamanio];
	}
	
	@Override
	public boolean estaVacia() {
		return indice==0;
	}

	@Override
	public Persona primero() {
		return cola[0];
	}

	@Override
	public Persona extraer() {
		if (indice>0) {
			Persona objeto = cola[0];
			for(int i=0; i<indice-1;i++) {
				cola[i]=cola[i+1];
			}
			indice--;
			cola[indice]=null;
			return objeto;
		}
		return null;
	}

	@Override
	public boolean insertar(Persona nuevo) {
		if (indice==cola.length) 
			return false; //cola llena
		else {
			cola[indice++]=nuevo;
			return true;
		}
			
	}

	@Override
	public void mostrar() {
		for (int i = 0; i < indice; i++) {
			System.out.println(cola[i].toString());
		}

	}

}
