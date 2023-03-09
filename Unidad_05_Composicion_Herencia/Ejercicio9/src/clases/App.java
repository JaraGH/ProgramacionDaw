package clases;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Pila pila = new Pila(3);
//		
//		pila.insertar(new Persona(1, "Pepe"));
//		pila.insertar(new Persona(2, "Ana"));
//		pila.insertar(new Persona(3, "Gema"));
//		System.out.println(pila.insertar(new Persona(5, "Alba")));
//		
//				
//		pila.mostrar();
//		
//		System.out.println("************");
//		System.out.println(pila.extraer().toString());
//		
//		System.out.println("************");
//		pila.mostrar();
//		
		Cola cola = new Cola(3);
		Persona p = cola.extraer();
		System.out.println( p==null? "cola vacía" : p.toString());
		
		
		cola.insertar(new Persona(1, "Pepe"));
		cola.insertar(new Persona(2, "Ana"));
		cola.insertar(new Persona(3, "Gema"));
		System.out.println(cola.insertar(new Persona(5, "Alba")));
		
				
		cola.mostrar();
//		
		System.out.println("************");
		System.out.println("Extraer: " + cola.extraer().toString());
		cola.insertar(new Persona(44, "Andrés"));
		System.out.println("************");
		cola.mostrar();
		
	}

}
