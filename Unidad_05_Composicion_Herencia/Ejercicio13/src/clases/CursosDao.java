package clases;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CursosDao implements IGestionaCursos{

	
	private String [] idCursos = {"1ESOA", "2ESOB", "4ESOC", "2BACHC", "DAW1", "ASIR2"};
	private String [] niveles = {"ESO", "ESO", "ESO", "BACH", "FP", "FP"};
	private Curso [] cursos = new Curso[6];
	
	public CursosDao() {
		try {
			List<String> estudiantes = Files.readAllLines(Paths.get("estudiantes.csv"), 
					StandardCharsets.UTF_8);
			List<String> profesores = Files.readAllLines(Paths.get("profesores.csv"), 
					StandardCharsets.UTF_8);
			
			for (int i=0; i<idCursos.length; i++) {
				
				String idCurso = "0000" + i;
				String nombreCurso = idCursos[i];
				String nivel = niveles[i];
				Profesor tutor = Profesor.getProfesor(profesores.get(i));
				//20 alumnos.
				Estudiante [] estus = new Estudiante[20];
				for (int j = 0; j < estus.length; j++) {
					estus[j] = Estudiante.getEstudiante(estudiantes.get(j));
				}
				
				cursos[i] = new Curso(idCurso, nombreCurso, nivel, tutor, estus);
			}			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void mostrar() {
		for (Curso curso : cursos) {
			System.out.println(curso.getId() + " " + curso.getNombre() +
					" " + curso.getEstudiantes().length);
		}
	}

	private Curso buscarCursoPorId(String idCurso) {
		for (Curso curso : cursos) {
			if (curso!=null && curso.getId().equals(idCurso))
				return curso;
		}
		return null;
	}
	
	@Override
	public void listaEstudiantesCurso(String idCurso) {
		Curso curso = buscarCursoPorId(idCurso);
		if (curso!=null) {
			Estudiante [] estus = curso.getEstudiantes();
			System.out.printf("Curso %s, %s. Listado de alumnos\n", idCurso, curso.getNombre());
			for (Estudiante estudiante : estus) {
				if (estudiante!=null) {
					System.out.println(estudiante.toString());
				}
			}
		}
		
	}

	@Override
	public Profesor getTutor(String idCurso) {
		// TODO Auto-generated method stub
		Curso curso = buscarCursoPorId(idCurso);
		return (curso!=null)? curso.getTutor(): null;  
	}

	@Override
	public long getNumeroCursos() {
		long contador  = Arrays.stream(cursos)
				.filter(Objects::nonNull).count();
		return contador; 
	}

	@Override
	public int getNumeroEstudiantesCurso(String idCurso) {
		Curso curso = buscarCursoPorId(idCurso);
		if (curso!=null)
			return curso.getEstudiantes().length;
		return 0;
	}

	@Override
	public long getNumeroTotalEstudiantes() {
		long  cuentaEstudiantes = 
			Arrays.stream(cursos)
					.flatMap((c)->Arrays.stream(c.getEstudiantes()))
					.count();
		return cuentaEstudiantes;
	}

	@Override
	public Estudiante[] getEstudiantesCurso(String idCurso) {
		Curso curso = buscarCursoPorId(idCurso);
		Estudiante [] estudiantesCurso;
		if (curso!=null) {
			estudiantesCurso = curso.getEstudiantes().clone();
			Arrays.sort(estudiantesCurso, new Comparator<Estudiante>() {

				@Override
				public int compare(Estudiante e1, Estudiante e2) {
					int result = e1.getApellidos().compareTo(e2.getApellidos()); 
					if (result==0) {
						return e1.getNombre().compareTo(e2.getNombre());
					} else {
						return result;
					}	
				}
				
			});
			return estudiantesCurso;
		}
		return null;
	}

	@Override
	public Estudiante[] getMenoresCurso(String idCurso) {
		Curso curso = buscarCursoPorId(idCurso);
		if (curso!=null && curso.getEstudiantes().length>0) {
			Estudiante [] menores = new Estudiante[curso.getEstudiantes().length];
			int indice=0;
			for (Estudiante estudiante : curso.getEstudiantes()) {
				int edad = Period.between(estudiante.getFechaNacimiento(), 
						LocalDate.now()).getYears();
				if (edad<18) {
					menores[indice++]=estudiante;
				}
			}
			Estudiante [] retorno = Arrays.copyOf(menores, indice);
			Arrays.sort(retorno, new Comparator<Estudiante>() {

				@Override
				public int compare(Estudiante o1, Estudiante o2) {
					// TODO Auto-generated method stub
					return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
				}
					
			});
			return retorno;
		}
		
		return null;
	}

	@Override
	public Profesor[] getTutores() {
		
		List<Profesor> l= Arrays.stream(cursos)
			.map( c -> c.getTutor())
			.collect(Collectors.toList());
		Profesor [] array = new Profesor[l.size()];
		return l.toArray(array);
	}

	
	

}
