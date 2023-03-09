package principal;

public class GestionDvd {
	
	private DvdCine [] pelis = {
		new DvdCine ("El hobbit. La desolación de Smaug", "Peter Jackson", "New Line Cinema."
		            + "Metro-Goldwyn-Mayer", "Ian McKellen, Martin Freeman", "Ciencia ficción", "Bla...", 123),
		
		new DvdCine ("El Padrino", "Francis Ford Copola", "Paramount Pictures"
		            , "Al Pacino, Marlon Brando", "Drama", "Bla...", 175),
		
		new DvdCine ("Titanic", "Francis Ford Copola", "Paramount Pictures. 20th Century Fox"
		            , "Di Caprio", "Drama", "Bla...", 123),
		new DvdCine ("El Rey León", "WD", "Walt Dysney"
		            , "------", "Animación", "Bla...", 86),
		new DvdCine ("Los Vengadores", "--", "Marvel Studios. Walt Dysney"
		            , "--", "Ciencia ficción", "Bla...", 114),
		new DvdCine ("Avatar", "Francis Ford Copola", "20th Century Fox"
		            , "--", "Ciencia ficción", "Bla...", 126),
		new DvdCine ("Harry Potter. Las reliquias de la muerte", "--", "Warner Bros.", "--", "Ciencia ficción", "Bla...", 131),
		new DvdCine ("El Señor de los anillos. El retorno del rey", "Francis Ford Copola", "New Line Cinema", "--", "Ciencia ficción", "Bla...", 175),
		new DvdCine ("Toy Story 3", "----", "Dysney/Pixar", "--", "Animación", "Bla...", 78),
		new DvdCine ("The Dark Knight Rises", "--", "Warner Bros.", "--", "Ciencia ficción", "Bla...", 99)
	};
	
	public DvdCine buscarPelicula (String tituloBuscado) {
		for (DvdCine dvdCine : pelis) {
			if (dvdCine.getTitulo().equalsIgnoreCase(tituloBuscado))
				return dvdCine;
		}
		//si no encuentra la peli retorna nulo
		return null;
	}
	
	//metodo que devuelve la duración de un titulo buscado
	public int duracionPeli (String tituloBuscado) {
	
		DvdCine peliBuscada = this.buscarPelicula(tituloBuscado);
		if (peliBuscada!=null) {
			//encontrada
			return peliBuscada.getDuracion();
		} else {
			return -1; // no encontrado
		}
	}
	
	
	
	
	public void mostrarPelis() {
		System.out.println("Listado de pelóculas");
		System.out.println("********************");
		
//		for (int i = 0; i < pelis.length; i++) {
//			System.out.println(pelis[i].getTitulo()+ "\t"+pelis[i].getProductora());
//		}
		
		//para cada elemento dentro de la colección
		//para cada DvdCine dentro de pelis
		//for each: para cada pelicula dentro del array
		//array: pelis
		//Clase del array: DvdCine

		for (DvdCine dvd : pelis) {
			System.out.println(dvd.getTitulo() 
					+ "\t" + dvd.getProductora());
		}		
	}
	
	public DvdCine buscarPeliMasLarga() {
	
		DvdCine peliMasLarga = pelis[0];
		for (int i = 1; i < pelis.length; i++) {
			if (pelis[i].getDuracion()>peliMasLarga.getDuracion())
				peliMasLarga=pelis[i];
		}
		return peliMasLarga;
		
		
		//System.out.println(peliMasLarga.getTitulo() + "--" + peliMasLarga.getDuracion());
		
	}
	
	
	public void filtrarPorGenero(String generoBuscado) {
		
		System.out.println("Pelis del género: " + generoBuscado);
		System.out.println("****************************");
		for (DvdCine dvdCine : pelis) {
			if (dvdCine.getGenero().equalsIgnoreCase(generoBuscado))
				System.out.println(dvdCine.toString());
		}
		
	}	
	
	
}
