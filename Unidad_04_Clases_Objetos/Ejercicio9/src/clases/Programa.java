package clases;

public class Programa {

	private String nombre;
	private String version;
	private String funcion;
	private int anio;
	private String empresa;
	private String licencia;
	private double precio;
	
	public Programa(String nombre, String version, String funcion, int anio, String empresa, String licencia,
			double precio) {
		this.nombre = nombre;
		this.version = version;
		this.funcion = funcion;
		this.anio = anio;
		this.empresa = empresa;
		this.licencia = licencia;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Programa [nombre=" + nombre + ", version=" + version + ", funcion=" + funcion + ", anio=" + anio
				+ ", empresa=" + empresa + ", licencia=" + licencia + ", precio=" + precio + "]";
	}
	
	
	
}
