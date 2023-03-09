package clases;

import java.time.LocalDate;

public class Estudiante extends Persona {
	
	private String tutorLegal;
	private String telefonoTutor;

	public static Estudiante getEstudiante(String lineaDatos) {

		String[] datos = lineaDatos.split(",");
		String[] datosFecha = datos[5].split("/");
		int mes = Integer.parseInt(datosFecha[0]);
		int dia = Integer.parseInt(datosFecha[1]);
		int anio = Integer.parseInt(datosFecha[2]);
		return new Estudiante(datos[0], datos[1], datos[2], datos[4], 
				datos[3], LocalDate.of(anio, mes, dia), datos[6], datos[7]);
	}

	public Estudiante(String id, String nombre, String apellidos, 
			String telefono, String correo,
			LocalDate fechaNacimiento, String tutor, String telefono2) {
		super(id, nombre, apellidos, telefono, correo, fechaNacimiento);
		this.tutorLegal = tutor;
		this.telefonoTutor = telefono2;
	}

	public String getTutor() {
		return tutorLegal;
	}

	public void setTutor(String tutor) {
		this.tutorLegal = tutor;
	}

	public String getTelefono() {
		return telefonoTutor;
	}

	public void setTelefono(String telefono) {
		this.telefonoTutor = telefono;
	}

	@Override
	public String toString() {
		return super.toString() + "Estudiante [tutor=" + tutorLegal + ", telefono=" + telefonoTutor + "]";
	}

}
