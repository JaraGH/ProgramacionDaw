package principal;

import java.text.DecimalFormat;

public class App {

	
	public static void main(String[] args) {
		
		double media = getMedia(20, 1, 2);
		
		System.out.println(media);
		
		DecimalFormat formato = new DecimalFormat("####.000");
		
		System.out.println("Media: " + formato.format(media));
		
	}
	
	
	static double getMedia(int v1, int v2, int v3) {		
		return (v1+v2+v3)/3.0;
	}
	
	
	
	
	
	
}
