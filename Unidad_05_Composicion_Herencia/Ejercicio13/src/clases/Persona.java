package clases;

import java.time.LocalDate;

public abstract class Persona {
	private String id;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String correo;
	private LocalDate fechaNacimiento;
	
	public Persona(String id, String nombre, String apellidos, String telefono, 
			String correo,
			LocalDate fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", correo=" + correo + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
}
