package clases;

import java.util.Random;

public class Password {
	private int longitud=8;
	private String password;
	
	public Password() {
		password= generarPassword();
	}
	
	public Password(int longitud) {
		this.longitud=longitud;
		password= generarPassword();
	}
	
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String generarPassword() {
		String pass="";
		Random rnd = new Random();
		String letras = "abcdefghijklmnopqrstuvwxyz";
		String especiales="@#$%&/()=?*{}[]";
		String numeros = "0123456789";
		String caracterPosibles = letras + letras.toUpperCase()+numeros+especiales;
		
		for (int i = 0; i <longitud; i++) {
			int posicion = rnd.nextInt(caracterPosibles.length());
			pass+=caracterPosibles.charAt(posicion);
		}
		return pass;
	}
	
	public boolean esFuerte() {
				int contadorMayus=0; int contadorMinus=0; int contadorNumeros=0;
		
		for (int i = 0; i < password.length(); i++) {
			Character caracter = password.charAt(i);
			if (Character.isDigit(caracter)) {
				contadorNumeros++;
			} else if (Character.isUpperCase(caracter)) {
				contadorMayus++;
			} else if (Character.isLowerCase(caracter)) {
				contadorMinus++;
			}
		}
		return (contadorMayus>2 && contadorMinus>1 && contadorNumeros>3);
	}
	
		
	
}
