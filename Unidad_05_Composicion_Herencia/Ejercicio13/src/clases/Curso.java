package clases;

import java.util.Arrays;

public class Curso {

	private String id;
	private String nombre;
	private String nivel;
	private Profesor tutor;
	private Estudiante [] estudiantes;
	
	public Curso(String id, String nombre, String nivel, Profesor tutor, Estudiante[] estudiantes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nivel = nivel;
		this.tutor = tutor;
		this.estudiantes = estudiantes;
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

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public Profesor getTutor() {
		return tutor;
	}

	public void setTutor(Profesor tutor) {
		this.tutor = tutor;
	}

	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", nivel=" + nivel + ", tutor=" + tutor + ", estudiantes="
				+ Arrays.toString(estudiantes) + "]";
	}
	
	
	
}
