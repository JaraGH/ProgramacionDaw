package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class GestionEventos {
	
    private List<Evento> arr = new ArrayList<>();
    
    public void nuevoEvento(Evento e){
        if (e!=null) arr.add(e);
    }
    
    public List<Evento> listaEventos(){
        return arr;
    }
    
    
    public List<Evento> listaEventos(int anio){
        List<Evento> array=new ArrayList<>();
        
        for (Evento evento : arr) {
            if (evento.getFecha().getYear()==anio)
                array.add(evento);
        }
        return array;
    }
    
    public List<Evento> listaEventos(int anio, int mes){
        List<Evento> array=new ArrayList<>();
        for (Evento evento : arr) {
            if (evento.getFecha().getYear()==anio && 
                    evento.getFecha().getMonthValue()==mes)
                array.add(evento);
        }
        return array;
    }
    
    public List<Evento> listaEventos(int anio, int mes, int dia){
        List<Evento> array=new ArrayList<>();
        for (Evento evento : arr) {
            if (evento.getFecha().getYear()==anio 
                    && evento.getFecha().getMonthValue()==mes 
                    && evento.getFecha().getDayOfMonth()==dia)
                array.add(evento);
        }
        return array;
    }
    
    public List<Evento> listaEventos(LocalDate fechaBuscada){
        List<Evento> array=new ArrayList<>();
        for (Evento evento : arr) {
            if (evento.getFecha().equals(fechaBuscada))
                array.add(evento);
        }
        return array;
    }
    
    public List<Evento> eventosPorFecha(String orden){ //D-descentente X-ascendente
        
    	final String ord = orden;
    	
        Collections.sort(arr, new Comparator<Evento>() {

			@Override
			public int compare(Evento evento1, Evento evento2) {
				
				int retorno = evento1.getFecha().compareTo(evento2.getFecha());
				return (ord.equals("D"))? retorno * -1: retorno;				
			}			
        });
        return arr;
        
    }
    
    public int eliminarElementos (int anio, int mes){
        Iterator it = arr.iterator();
        int contador=0;
        //mientras haya siguiente, o mientras tenga siguiente
        while (it.hasNext()){
            Evento e = (Evento) it.next(); //dame el siguiente.
            if (e.getFecha().getYear()==anio &&
                    e.getFecha().getMonthValue()==mes){
                it.remove();
                contador++;
            }
        }
        return contador;
    }
    
}
