package clases;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionEventos lista = new GestionEventos();

		lista.nuevoEvento(new Evento("Concierto U2", 120, "Wizink Center Madrid", LocalDate.of(2023, 8, 12)));
		lista.nuevoEvento(new Evento("Concierto Leiva", 29, "Wizink Center Madrid", LocalDate.of(2023, 4, 24)));
		lista.nuevoEvento(new Evento("Baloncesto España-Rusia", 29, "Badajoz", LocalDate.of(2023, 4, 24)));
		lista.nuevoEvento(new Evento("Campeonato España Atletismo", 30, "Granada, Estadio Los Cármenes",
				LocalDate.of(2023, 6, 12)));
		lista.nuevoEvento(new Evento("Concierto Estopa", 50, "San Sebastián", LocalDate.of(2023, 4, 12)));
		lista.nuevoEvento(new Evento("Campeonato España Atletismo", 30, "San Sebastián", LocalDate.of(2023, 6, 12)));
		lista.nuevoEvento(new Evento("Campeonato España Atletismo Indoor", 30, "Mérida", LocalDate.of(2024, 6, 23)));

		//mostrar datos orden Descendente
//		for (Evento evento : lista.eventosPorFecha("D")) {
//			System.out.println(evento);
//		}

		// eliminar del año 2024

        System.out.println("Eliminados: " + lista.eliminarElementos(2024, 6));
        
//        //Todos los eventos
//        System.out.println("Todos los eventos");
//        for (Evento e: lista.listaEventos()) {
//            System.out.println(e.toString());
//        }
//        System.out.println("");
//        
//        //Eventos del año 2023
//        System.out.println("Eventos año 2023");
//        for (Evento e: lista.listaEventos(2023)) {
//            System.out.println(e.toString());
//        }
//        System.out.println("");
//        
//        //Eventos del año 2023, mes 4
//        System.out.println("Eventos año 2023, mes 4");
//        for (Evento e: lista.listaEventos(2023, 4)) {
//            System.out.println(e.toString());
//        }
//        System.out.println("");
//        
//      
        
//        System.out.println("Eventos año 2018, mes 4, día 12");
//        for (Evento e: lista.listaEventos(2018,4, 12)) {
//            System.out.println(e.toString());
//        }
//        System.out.println("");
//        
//        //Eventos de la fecha 
        LocalDate fecha = LocalDate.of(2023, 4, 24);
        System.out.println("Eventos de la fecha: " + fecha.toString());
        for (Evento e: lista.listaEventos(fecha)) {
            System.out.println(e.toString());
        }
//        System.out.println("");
//        
	}

}
