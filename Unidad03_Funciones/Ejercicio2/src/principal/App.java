package principal;

public class App {

	
	public static void main(String[] args) {
		
		char charInicio='z', charFin='h';
		
		imprimeCaracteres(charInicio, charFin);
		
	}
	
	static void imprimeCaracteres(char inicio, char fin) {
		//intercambiar si inicio es > fin
		if (inicio>fin) {
			char aux=inicio;
			inicio=fin;
			fin=aux;
		}
		for (char letra = inicio; letra <= fin; letra++) {
			System.out.println(letra);
		}
		
	}
	
	
	
	
	
	
}
