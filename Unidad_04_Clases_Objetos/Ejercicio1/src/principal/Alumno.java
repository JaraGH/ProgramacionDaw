package principal;

import java.time.LocalDate;

//número de expediente, nombre, apellidos, fecha de nacimiento y curso en el que se matricula. La clase debe incluir 
//un constructor y los métodos get y set correspondientes y toString.
//un constructor y los métodos get y set correspondientes y toString.
public class Alumno {

	private String numeroExpediente;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String curso;
	
	public Alumno(String numeroExpediente, String nombre, String apellidos, LocalDate fechaNacimiento, String curso) {
		super();
		this.numeroExpediente = numeroExpediente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.curso = curso;
	}

	public String getNumeroExpediente() {
		return numeroExpediente;
	}

	public void setNumeroExpediente(String numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [numeroExpediente=" + numeroExpediente + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", fechaNacimiento=" + fechaNacimiento + ", curso=" + curso + "]";
	}
	
	
	
	
}
