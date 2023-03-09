package principal;

public class Empleado {

	private int id;
	private String nombre;
	private String apellidos;
	private double salario;
	
	public Empleado(int id, String nombre, String apellidos, double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}
	
	//getNombreCompleto. Devuelve el nombre 
	//del empleado con la forma: Apellidos, Nombre.
	
	public String getNombreCompleto() {
		return apellidos + ", " + nombre;
	}
	
	
	//getSalarioAnual. Este se obtiene multiplicando 
	//por doce el salario mensual.
	
	public double getSalarioAnual() {
		return salario*12;
	}
	
	
	
	//incrementaSalario (int porcentaje). 
	//Incrementa el salario en el porcentaje indicado
	public void incrementaSalario (int incremento) {
		this.salario = this.salario + this.salario*incremento/100;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario + "]";
	}
	
	
}
