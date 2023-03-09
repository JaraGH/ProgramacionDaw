package clases;

public class GestionPrograma {
	private Programa [] programas = new Programa[10];
	private int indice;
	
	public GestionPrograma() {
		programas[0]= new Programa ("Windows","7","SO",2007,"Microsoft", "Comercial",90);
        programas[1]= new Programa ("Windows","10","SO",2014,"Microsoft", "Comercial",190);
        programas[2]= new Programa ("Ubuntu","16","SO",2016,"Canonical", "GPL",0);
        programas[3]= new Programa ("MariaDB","3.0.15","BD",2020,"Michaek Widenius", "GPL",0);
        programas[4]= new Programa ("MongoDB","3","BD NoSQL",2016,"MongoDB Inc.", " GNU AGPL",0);
        indice=5;
	}	
		
	public boolean anadirPrograma (Programa programa) {
		//¿hay espacio?
		if (indice<programas.length) {
			programas[indice]=programa;
			indice++;
			return true;
		} else {//no hay hueco
			return false;
		}		
	}
	
	public boolean eliminarUltimo() {
		//preguntar si array estï¿½ vacï¿½o
		if (indice>0) {
			indice--;
			programas[indice]=null;
			return true; //se pudo eliminar
		}
		return false; //no se pudo eliminar, estaba vacï¿½o
		
	}
	

	public void mostrar() {
		System.out.println("Listado de programas");
		for(int i=0; i<indice;i++)
			System.out.println(programas[i].toString());
		//otra forma
//		for (Programa programa : programas) {
//			if (programa!=null)
//				System.out.println(programa.toString());
//		}
				
	}
	
	public void filtrarPorLicencia(String licencia) {
		System.out.println("Filtrando por licencia: " + licencia);
		for(int i=0; i<indice;i++) {
			if (programas[i].getLicencia().equalsIgnoreCase(licencia))
				System.out.println(programas[i].toString());
		}
	}

	public void filtrarPorFuncion(String funcion) {
		System.out.println("Filtrando por funciÃ³n: " + funcion);
		for (Programa programa : programas) {
			if (programa!=null && programa.getFuncion().equalsIgnoreCase(funcion))
				System.out.println(programa.toString());
		}
	}
	
	public Programa buscarPorNombre(String nombrePrograma) {
		for(int i=0; i<indice;i++) {
			if (programas[i].getNombre().equalsIgnoreCase(nombrePrograma))
				return programas[i];
		}
		return null;
	}
	
}
