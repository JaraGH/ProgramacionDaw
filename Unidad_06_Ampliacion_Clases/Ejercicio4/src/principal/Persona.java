package principal;

import java.time.LocalDate;

public class Persona implements Comparable<Persona>{

	private int id;
	private String nombre;
	private LocalDate fechaNacimiento;
	
	
	public Persona(int id, String nombre, LocalDate fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}


	@Override
	public int compareTo(Persona arg0) {
		// TODO Auto-generated method stub
		return  - this.fechaNacimiento.compareTo(arg0.fechaNacimiento);
	}
	
	
}
