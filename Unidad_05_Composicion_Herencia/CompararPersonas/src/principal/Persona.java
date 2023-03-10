package principal;

public class Persona implements Comparable<Persona> {

	private Integer id;
	private String nombre;
	private Integer edad;
	public Persona(Integer id, String nombre, Integer edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	@Override
	public int compareTo(Persona otraPersona) {
		
		return - this.getEdad().compareTo(otraPersona.getEdad());
	}
	
	
	
	
}
