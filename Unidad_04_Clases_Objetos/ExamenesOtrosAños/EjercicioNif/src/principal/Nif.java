package principal;



public class Nif {

	private String nif;
	
	
	public String getLetra() {
		return nif.substring(nif.length()-1);
	}
	
	public String getNumero() {
		return nif.substring(0, nif.length()-1);
	}
	
	public boolean esCorrecto() {
		String [] letras = {"T", "R","W", "A", "G",
			"M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z",
			"S", "Q", "V", "H", "L", "C", "K", "E"};
		
		int numero = Integer.parseInt(getNumero());
//		int resto = numero%23;
//		String letraDeberia = letras[resto];
//		
//		if (letraDeberia.equals(getLetra())) 
//			return true;
//		else
//			return false;
		
		return getLetra().equals(letras[numero%23]);
	}
	

	public Nif(String nif) {
		this.nif = nif;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}
	
	
}
