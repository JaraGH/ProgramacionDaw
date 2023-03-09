package principal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto pro1 = new Producto(1, "Teclado", "Periféricos", 14.3);
		Producto pro2 = new Producto(2, "Teclado", "Periféricos" , 16.2);
		
		System.out.println(pro1.getPrecio());
		
		pro2.setNombre("ASDfasdf");
		
		System.out.println(pro1.toString());
		System.out.println(pro2.toString());
		
	}

}
