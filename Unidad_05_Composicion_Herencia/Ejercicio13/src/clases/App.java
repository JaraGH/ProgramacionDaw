package clases;

import java.time.LocalDate;
import java.time.Period;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CursosDao dao = new CursosDao();
		//dao.listaEstudiantesCurso("00001");
//		System.out.printf("Tutor: %s", dao.getTutor("00001").getNombre());
//		System.out.println("Nº cursos: " + dao.getNumeroCursos());
//		System.out.println("Nº estudiantes curso: " + dao.getNumeroEstudiantesCurso("00001"));
//		System.out.println("Nº total estudiantes: " + dao.getNumeroTotalEstudiantes());ç
		for (Estudiante estudi : dao.getEstudiantesCurso("00001")) {
			System.out.println(estudi.getApellidos() + ", " + 
						estudi.getNombre() + " - " + estudi.getCorreo());
		}
//		for (Estudiante estudi : dao.getMenoresCurso("00001")) {
//			System.out.println(estudi.getNombre() + " - " + estudi.getCorreo() + " - "
//					+ estudi.getFechaNacimiento());
//		}

//		for (Profesor tutor : dao.getTutores()) {
//			System.out.println(tutor.toString());
//		}
	}

}
