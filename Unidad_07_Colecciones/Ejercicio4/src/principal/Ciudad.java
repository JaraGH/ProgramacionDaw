package principal;

public class Ciudad {
	private String nombre;
    private String pais;
    private Integer habitantes;

    public Ciudad(String nombre, String pais, Integer habitantes) {
        this.nombre = nombre;
        this.pais = pais;
        this.habitantes = habitantes;
    }

    public Integer getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(Integer habitantes) {
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

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", pais=" + pais + ", habitantes=" + habitantes + '}';
    }
}
