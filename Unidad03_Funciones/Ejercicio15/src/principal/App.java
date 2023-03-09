package principal;

public class App {

	
	public static void main(String[] args) {
		
		String cad="holA amiGóos";
		
		System.out.println(cuentaVocales(cad));
		
	}
	
	
	
	
	
	static int cuentaVocales(String cadena) {
		//cad="holA amiGos"		
		
		String vocales = "aeiouáéíóú";
		//la paso a minusculas
		cadena = cadena.toLowerCase();
		
		int cuentaVocales=0;
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
					//h
			if (vocales.indexOf(caracter)>=0)			
				cuentaVocales++;
		}
		return cuentaVocales;
	}
			
}
