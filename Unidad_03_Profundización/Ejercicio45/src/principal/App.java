package principal;

public class App {

	public static void main(String[] args) {
		char letra='F';
		for (int i=1; i<=26; i++) {
			System.out.println(i + "---" + letra);
			if (i%5==0) //if (letra=='J')
				letra='F';
			else
				letra++;
		}
		
		
	}

}
