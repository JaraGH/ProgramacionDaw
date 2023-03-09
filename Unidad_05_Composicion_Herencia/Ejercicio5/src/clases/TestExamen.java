/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author jose
 */
public class TestExamen {
    Examen [] examenes = new Examen[20];

    public TestExamen() {
        for (int i = 0; i < examenes.length; i++) {
            Pregunta [] preguntas = new Pregunta[20];
            for (int j = 0; j < preguntas.length; j++) {
                String [] respuestas = new String[4];
                for (int k = 0; k < respuestas.length; k++) {
                    respuestas[k]="Pregunta " + (j+1) + ". Respuesta " + (k+1);
                }
                int correcta = (int) (Math.random()*4);
                preguntas[j] = new Pregunta("Pregunta" + (j+1), respuestas, correcta);
            }
            examenes[i]= new Examen("Examen " + (i) , preguntas);
        }
    }
    
    
    public void mostrarExamen(int numero){
        if (numero >=0 && numero< examenes.length){
            System.out.println("Descripción: " + examenes[numero].getDescripcion());
            //recorrer sus preguntas
            
            int j=1;
            for (Pregunta pregunta : examenes[numero].getPreguntas()) {
                System.out.println((j++) + "." + pregunta.getEnunciado());
                char letra='a';
                for (String respuesta : pregunta.getRespuestas()) {
                    System.out.println("\t" + (letra++) + "." +  respuesta);
                }
            }

        }
            
        else
            System.out.println("Error en el n�mero de examen");
    }
    
    public void mostrarExamen(int numero, boolean correcta){
        if (numero >=0 && numero< examenes.length){
            System.out.println("Descripción: " + examenes[numero].getDescripcion());
            //recorrer sus preguntas
            
            int j=1;
            for (Pregunta pregunta : examenes[numero].getPreguntas()) {
                System.out.println((j++) + "." + pregunta.getEnunciado());
                char letra='a';
                int numeroResp=0;
                for (String respuesta : pregunta.getRespuestas()) {
                    if (pregunta.getCorrecta()==numeroResp)
                        System.out.println("\t" + (letra++) + "." +  respuesta + "--Correcta");
                    else
                        System.out.println("\t" + (letra++) + "." +  respuesta);
                    numeroResp++;
                }
            }

        }
            
        else
            System.out.println("Error en el número de examen");
    }
    
}
