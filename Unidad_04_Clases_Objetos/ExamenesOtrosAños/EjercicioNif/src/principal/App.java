package principal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] nifs = {"80137039T","30198235S" , 
				"15835050X", "30533829H", "46548712R", 
				"30499569M", "30437328W", "30519074Y"}; 
		
//		for (int i = 0; i < nifs.length; i++) {
//			Nif n = new Nif(nifs[i]);
//			System.out.println(n.getNif() + "-->"+n.esCorrecto());
//		}
	
		
		
		for (String  nif: nifs) {
			Nif n = new Nif(nif);
			System.out.println(n.getNif() + "-->"+n.esCorrecto());
		}

		
	}

}
