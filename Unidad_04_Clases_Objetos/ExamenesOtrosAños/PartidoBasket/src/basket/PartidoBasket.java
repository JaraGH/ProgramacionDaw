package basket;

public class PartidoBasket {

	private String equipoLocal;
	private String equipoVisitante;
	private String competicion;
	private int puntosLocal;
	private int puntosVisitante;
	
	public String getResultado() {
		return equipoLocal + " " + puntosLocal +
				" - " + puntosVisitante + " " + equipoVisitante;
	}
	
	public PartidoBasket comparaPartido(PartidoBasket otroPartido) {
		if (this.diferenciaPuntos()==otroPartido.diferenciaPuntos())
			return null;
		else if (this.diferenciaPuntos()>otroPartido.diferenciaPuntos())
			return this;
		else 
			return otroPartido;
		
	}
	
	public static PartidoBasket comparaPartido(PartidoBasket partido1, PartidoBasket partido2) {
		if (partido1.diferenciaPuntos()==partido2.diferenciaPuntos())
			return null;
		else if (partido1.diferenciaPuntos()>partido2.diferenciaPuntos())
			return partido1;
		else 
			return partido2;
	}
	
	
	public String getEquipoGanador() {
		return (puntosLocal>puntosVisitante)? equipoLocal: equipoVisitante;
	}
	
	private int diferenciaPuntos() {
		int difePuntos = puntosLocal - puntosVisitante;
		if (difePuntos<0)
			difePuntos*=-1;
		return difePuntos;
		//return Math.abs(puntosLocal-puntosVisitante);
		
		//return (difePuntos<0)? difePuntos*-1: difePuntos;
	}
	
	public PartidoBasket(String equipoLocal, String equipoVisitante, String competicion, int puntosLocal,
			int puntosVisitante) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.competicion = competicion;
		this.puntosLocal = puntosLocal;
		this.puntosVisitante = puntosVisitante;
	}

	public String getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public String getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public String getCompeticion() {
		return competicion;
	}

	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}

	public int getPuntosLocal() {
		return puntosLocal;
	}

	public void setPuntosLocal(int puntosLocal) {
		this.puntosLocal = puntosLocal;
	}

	public int getPuntosVisitante() {
		return puntosVisitante;
	}

	public void setPuntosVisitante(int puntosVisitante) {
		this.puntosVisitante = puntosVisitante;
	}

	@Override
	public String toString() {
		return "PartidoBasket [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + ", competicion="
				+ competicion + ", puntosLocal=" + puntosLocal + ", puntosVisitante=" + puntosVisitante + "]";
	}
	
	
	
	
}
