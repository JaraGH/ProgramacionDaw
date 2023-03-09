package principal;

public class Triangulo extends FiguraGeometrica{
	
	private double altura, base;
	private double lado1, lado2;
	
	public Triangulo(String color, double altura, double base, double lado1, double lado2) {
		super(color);
		this.altura = altura;
		this.base = base;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return altura*base/2;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return base+lado1+lado2;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public String toString() {
		return "Triangulo [altura=" + altura + ", base=" + base + ", lado1=" + lado1 + ", lado2=" + lado2 + "]";
	}

	
	
}
