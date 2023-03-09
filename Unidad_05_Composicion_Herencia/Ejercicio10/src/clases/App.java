package clases;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfazNumeros g = new GestionNumeros();
		GestionNumeros gg = new GestionNumeros();
		
		//g.mostrarNumeros();
		System.out.println("**************");
		g.mostrarNumerosComoString();
//		g.multiplicaPor(2);
//		g.mostrarNumerosComoString();
////		System.out.println("*************");
//		System.out.println("Valores mayores que 4: " + 
//				g.contarValoresMayoresQue(4));
		System.out.println("Valores entre que 4 y 8: " + 
				g.contarValoresEntre(4, 8));
//		
//		System.out.println("*************");
//		System.out.println(g.compararCon(new int[] {1,1,1,1}));
//		System.out.println("**********************************");
//		System.out.println(Arrays.toString(g.getArray(new int[] {1,1,1,1,1,1,1,1,1,1,1,1})));
		
	}

}
