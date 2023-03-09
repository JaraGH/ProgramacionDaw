package principal;

public class Circulo extends FiguraGeometrica{

	private double radio;

	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radio * radio;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radio;
	}
	
	
}
