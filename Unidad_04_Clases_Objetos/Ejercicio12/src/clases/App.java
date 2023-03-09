package clases;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 10; i < 50; i+=10) {
			Password password = new Password(i);
			System.out.printf("\nPassword generada: %s. Es fuerte? %b", password.getPassword(),
					password.esFuerte());
			
		}
		
		
	}

}
