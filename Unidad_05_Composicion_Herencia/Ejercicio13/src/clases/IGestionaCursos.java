package clases;

public interface IGestionaCursos {

	public void listaEstudiantesCurso(String idCurso);
	public Profesor getTutor(String idCurso);
	public long getNumeroCursos();
	public int getNumeroEstudiantesCurso(String idCurso);
	public long getNumeroTotalEstudiantes();
	public Estudiante [] getEstudiantesCurso(String idCurso);
	public Estudiante [] getMenoresCurso(String idCurso);
	public Profesor [] getTutores();

	
}
