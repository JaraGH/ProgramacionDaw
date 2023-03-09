package principal;

public class DvdCine {
	private String titulo;
	private String director;
	private String productora;
	private String actores;
	private String genero;
	private String resumen;
	private int duracion;
	
	public DvdCine(String titulo, String director, String productora, String actores, String genero, String resumen,
			int duracion) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.productora = productora;
		this.actores = actores;
		this.genero = genero;
		this.resumen = resumen;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getActores() {
		return actores;
	}

	public void setActores(String actores) {
		this.actores = actores;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public boolean isThriller() {
		return this.genero.equalsIgnoreCase("thriller");
	}
	
	
	public boolean mismaProductora(DvdCine otraPeli) {
		return this.productora.equalsIgnoreCase(otraPeli.getProductora());
	}

	@Override
	public String toString() {
		return "DvdCine [titulo=" + titulo + ", director=" + director + ", productora=" + productora + ", actores="
				+ actores + ", genero=" + genero + ", resumen=" + resumen + ", duracion=" + duracion + "]";
	}
	
}
