package principal;

public abstract class FiguraGeometrica {

	private String color;
	
	
	@Override
	public String toString() {
		return "FiguraGeometrica [color=" + color + "]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public FiguraGeometrica(String color) {
		super();
		this.color = color;
	}
	public abstract double area();
	public abstract double perimetro();
	
}
