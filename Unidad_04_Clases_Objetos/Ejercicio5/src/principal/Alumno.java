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
	private double nota1;
	private double nota2;
	
	
	public Alumno(String numeroExpediente, String nombre, 
			String apellidos, LocalDate fechaNacimiento, String curso,
			double nota1, double nota2) {
		this.numeroExpediente = numeroExpediente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.curso = curso;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public double getNotaMedia() {
		return (nota1+nota2)/2;
	}
	
	public String getDatosAlumno() {
		return "Alumno: " + this.numeroExpediente + 
				"-" + this.nombre + " " + this.apellidos
				+ "-" + this.getNotaMedia();
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
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
				+ ", fechaNacimiento=" + fechaNacimiento + ", curso=" + curso + ", nota1=" + nota1 + ", nota2=" + nota2
				+ "]";
	}

	
	
	
	
	
	
}
