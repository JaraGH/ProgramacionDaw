package clases;

import java.time.LocalDate;

public class Profesor extends Persona{

	private String especialidad;
//	private String [] especialidades = {"EspA" , "EspB", "EspC", "EspD"};
	
	
	public static Profesor getProfesor(String lineaDatos) {
		
		String [] datos = lineaDatos.split(",");
		String [] datosFecha = datos[5].split("/");
		int mes= Integer.parseInt(datosFecha[0]);
		int dia= Integer.parseInt(datosFecha[1]);
		int anio= Integer.parseInt(datosFecha[2]);
		return new Profesor(datos[0], datos[1], datos[2], datos[4], datos[3],
				LocalDate.of(anio, mes, dia), datos[6]);
	}
	
	public Profesor(String id, String nombre, String apellidos, 
			String telefono, String correo,
			LocalDate fechaNacimiento, String especialidad) {
		super(id, nombre, apellidos, telefono, correo, fechaNacimiento);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return super.toString()+ " Profesor [especialidad=" + especialidad + super.toString() + " ]";
	}
	
	
}
