package clases;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaDao dao = new PersonaDao();
		
		dao.insertarPersona(new Persona("001", "Ana",  
				new Trabajo("001","Jefe ventas", 2300.33)));
		dao.insertarPersona(new Persona("002", "Luis", 
				new Trabajo("002","Comercial", 1300.33)));
		dao.insertarPersona(new Persona("003", "Elena", 
				new Trabajo("003","Jefe ventas", 2300.33)));
		dao.insertarPersona(new Persona("004", "Sara", 
				new Trabajo("003","Jefe Dpto Informática", 2500.33)));
		
		
		Persona p = dao.buscarPersona("122");
		
//		if (p==null)
//			System.out.println("Persona no encontrada");
//		else
//			System.out.println(p.toString());
//		
		dao.ordenarDatos();
		dao.mostrarDatos();
//		System.out.println("*************************");
//		for (Persona persona : dao.getNPrimerasPersonas(2)) {
//			System.out.println(persona.toString());
//		}
		
	}

}
