package principal;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;

public class GestionAlumnos {
	
	private Alumno [] alumnos = new Alumno[10];
	
	
	public void llenarArray() {
		String [] cursos = {"DAW1", "DAW2", "ASIR1", "ASIR2", "SMR"};
		Random rnd =  new Random();
		char letra = 'a';
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i]=new Alumno(
					"0001"+i,
					"Alumno000" + i,
					"Robles Lopez",
					LocalDate.of(rnd.nextInt(10) + 1990, rnd.nextInt(12)+1, rnd.nextInt(30)+1),
					cursos[rnd.nextInt(cursos.length)],
					rnd.nextDouble()*10,
					rnd.nextDouble()*10
					);
		}
		
		
	}
	
	public void mostrarAlumno() {
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre() + " " + alumno.getApellidos());
			System.out.println("Nota media: " + alumno.getNotaMedia());
			System.out.println("********************");
		}
	}
	
	public void mostrarNotas() {
		for (Alumno alumno : alumnos) {
			System.out.println("Nº expdte: " + alumno.getNumeroExpediente());
			System.out.println("Nombre: " + alumno.getNombre() + " " + alumno.getApellidos());
			System.out.println("Nota media: " + alumno.getNotaMedia());
			System.out.println("********************");
		}
	}

	public Alumno getAlumnoByNumeroExpediente(String numeroExpediente) {
		for (Alumno alumno : alumnos) {
			if (alumno.getNumeroExpediente().equals(numeroExpediente))
				return alumno;
		}
		return  null;
	}

	public Optional<Alumno> getAlumnoByNumeroExpediente2 (String numeroExpediente){
		for (Alumno alumno : alumnos) {
			if (alumno.getNumeroExpediente().equals(numeroExpediente))
				return Optional.of(alumno);
		}
		return  Optional.ofNullable(null);
	}
}
