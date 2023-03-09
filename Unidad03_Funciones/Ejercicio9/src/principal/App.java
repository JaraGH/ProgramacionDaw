package principal;

import java.util.Random;

public class App {

	
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
		
			System.out.println(getCaracterAzar());
		
		}
		
	}
	
	
	static char getCaracterAzar() {
		
		Random rnd = new Random();
		
		
		int tipoLetra =  rnd.nextInt(2); //retorna 0 o 1 
		//0 --> minuscula
		//1 --> mayuscula
		
		int codAscii = rnd.nextInt(26)+65; //[65,90] 
		
		if (tipoLetra==0) //retorno minuscula
			codAscii+=32;
		
		return (char) codAscii;
	}
	
}
