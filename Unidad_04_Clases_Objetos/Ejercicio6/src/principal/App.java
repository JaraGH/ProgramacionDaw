package principal;

import java.util.Optional;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		GestionAlumnos gestion = new GestionAlumnos();
		
		gestion.llenarArray();
		gestion.mostrarAlumno();
		
		//gestion.mostrarNotas();
		
//		Alumno alumno = gestion.getAlumnoByNumeroExpediente("1");
//		
//		if (alumno==null)
//			System.out.println("No encontrado");
//		else {
//			System.out.println("Encontrado");
//			//cambiar apellidos
//			alumno.setApellidos("Rama Rama");
//			
//		}
//		
//		System.out.println("**************************");
//		gestion.mostrarAlumno();
		
			
		
		
//		Optional<Alumno> optional = gestion.getAlumnoByNumeroExpediente2("1000");
//		
//		if (optional.isPresent())
//			System.out.println(optional.toString());
//		else
//			System.out.println("No se encontró");
		
	}

}
