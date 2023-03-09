package clases;

import basket.PartidoBasket;

public class App {

	public static void main(String[] args) {
		
		PartidoBasket partido1 = new PartidoBasket("Chicago Bulls", "Boston Celtics", "NBA", 100, 98);
		PartidoBasket partido2 = new PartidoBasket("Dallas Mavericks", "Toronto Raptors", "NBA", 110, 144);
		
		System.out.println(partido1.getResultado());
		
		System.out.println(PartidoBasket.comparaPartido(partido1, partido2));
		System.out.println(partido1.comparaPartido(partido2));
		System.out.println(partido2.comparaPartido(partido1));
		
	}

}
