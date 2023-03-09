package principal;

public class Ciudad2 {
	private String nombre;
    private String pais;
    private int habitantes;
	public Ciudad2(String nombre, String pais, int habitantes) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.habitantes = habitantes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	@Override
	public String toString() {
		return "Ciudad2 [nombre=" + nombre + ", pais=" + pais + ", habitantes=" + habitantes + "]";
	}

    
}
