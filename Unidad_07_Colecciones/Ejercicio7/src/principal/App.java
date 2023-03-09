package principal;

import java.util.Set;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diccionario diccionario = new Diccionario("Español");
		
		//palabra con un sign.
		diccionario.addPalabra("casa", "Construcción destinada a...");
		diccionario.addPalabra("casa", "Verbo casar 3ª persona...");
		diccionario.addPalabra("casa", "Verbo casar 3ª persona...");
		
		
		//palabra con varios sign en arrayList
//		List<String> significadosList = Arrays.asList("Lugar para sentarse", "Institución financiera");
//		diccionario.addPalabra("banco", significadosList);
		
		//palabra con varios sifn en array
//		String [] significadosArray = {"Lugar para sentarse", "Institución financiera"};
//		diccionario.addPalabra("banco", significadosArray);
		
		//palabra con varios sifn y separador
//		String significadosSeparador = "Lugar para sentarse,Institución financiera";
//		String separador = ",";
//		diccionario.addPalabra("banco", significadosSeparador, separador);
//		
		
		
//		String palabraBuscada = "banco";
//		List<String> significadosDe = diccionario.getSignificadosDe(palabraBuscada);
//		
//		if (significadosDe!=null) {
//			System.out.println("Significados de: " + palabraBuscada);
//			System.out.println("*********************");
//			for (String string : significadosDe) {
//				System.out.println(string);
//			}
//		} else {
//			System.out.printf("La palabra %s no existe", palabraBuscada);
//		}
		
		
		System.out.println("**************************************************");
		String palabraBuscada = "casa";
		Set<String> significadosDe = diccionario.getSignificadosDe(palabraBuscada);
		
		if (significadosDe!=null) {
			System.out.println("Significados de: " + palabraBuscada);
			System.out.println("*********************");
			for (String string : significadosDe) {
				System.out.println(string);
			}
		} else {
			System.out.printf("La palabra %s no exite", palabraBuscada);
		}
		
	}

}
