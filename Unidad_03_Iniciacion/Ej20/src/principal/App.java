package principal;


import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Meses del año");
		System.out.println("*************");
		
		System.out.print("Teclea un nº entre 1 y 12");
		
		int mes = entrada.nextInt();
		
		if (mes==1) {
			System.out.printf("El mes %d es enero", mes);
		} else if (mes==2) {
			System.out.printf("El mes %d es febrero", mes);
		} else if (mes==3) {
			System.out.printf("El mes %d es marzo", mes);
		} else if (mes==4) {
			System.out.printf("El mes %d es abril", mes);
		} else if (mes==5) {
			System.out.printf("El mes %d es mayo", mes);
		} else if (mes==6) {
			System.out.printf("El mes %d es junio", mes);
		} else if (mes==7){
			System.out.printf("El mes %d es julio", mes);
		} else if (mes==8){
			System.out.printf("El mes %d es agosto", mes);
		} else if (mes==9){
			System.out.printf("El mes %d es septiembre", mes);
		} else if (mes==10){
			System.out.printf("El mes %d es octubre", mes);
		} else if (mes==11){
			System.out.printf("El mes %d es noviembre", mes);
		} else if (mes==12){
			System.out.printf("El mes %d es diciembre", mes);
		} else {
			System.out.printf("Error en el mes");
		}	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
