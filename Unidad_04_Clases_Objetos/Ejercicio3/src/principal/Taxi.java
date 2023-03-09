package principal;

public class Taxi {
	//matrícula, distrito en el que opera (texto), 
	//tipo motor (diesel o gasolina) y  
	//coordenadas (latitud y longitud por separado) en las que se ubica.

	private String matricula;
	private String distrito;
	private String tipoMotor;
	private String latitud;
	private String longitud;
	
	
	
	public Taxi(String matricula, String distrito, String tipoMotor, String latitud, String longitud) {
		
		this.matricula = matricula;
		this.distrito = distrito;
		this.tipoMotor = tipoMotor;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	
	
	
	public Taxi(String matricula, String distrito, String tipoMotor) {
		super();
		this.matricula = matricula;
		this.distrito = distrito;
		this.tipoMotor = tipoMotor;
		this.latitud="0";
		this.longitud="0";
	}

	
	public boolean mismoDistrito(Taxi otroTaxi) {
		return this.distrito.equals(otroTaxi.distrito);
//		if (this.distrito.equals(otroTaxi.distrito))
//			return true;
//		else 
//			return false;
	}
	
	public String getCoordenadas() {
		return "Latitud: " + this.latitud + "---" + 
				"Longitud: " + this.longitud;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	public String getLatitud() {
		return latitud;
	}
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}


	@Override
	public String toString() {
		return "Taxi [matricula=" + matricula + ", distrito=" + distrito + ", tipoMotor=" + tipoMotor + ", latitud="
				+ latitud + ", longitud=" + longitud + "]";
	}
	
	
	
}
