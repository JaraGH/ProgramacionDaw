package clases;

public class Trabajo {
	private String id;
	private String descripcion;
	private double salario;
	
	public Trabajo(String id, String descripcion, double salario) {
		this.id = id;
		this.descripcion = descripcion;
		this.salario = salario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajo [id=" + id + ", descripcion=" + descripcion + ", salario=" + salario + "]";
	}
	
	
}
