package main;


public class Cliente implements Comparable<Cliente>{
	private String id;
	private String nombre;
	private String apellidos;

	
	public Cliente(String id, String nombre, String apellidos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	@Override
	public int compareTo(Cliente otroCliente) {
		// TODO Auto-generated method stub
		
		int result = this.nombre.compareTo(otroCliente.getNombre());
		if (result==0) {
			return this.apellidos.compareTo(otroCliente.getApellidos());
		} else {
			return result;
		}
	}

	
	
	
	
}
