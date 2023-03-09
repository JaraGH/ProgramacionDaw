package clases;

public class Persona {

	private String dni;
	private String nombre;
	private Trabajo puesto;
	
	public Persona(String dni, String nombre, Trabajo puesto) {
		this.dni = dni;
		this.nombre = nombre;
		this.puesto = puesto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Trabajo getPuesto() {
		return puesto;
	}

	public void setPuesto(Trabajo puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", puesto=" + puesto + "]";
	}
	
	
}
