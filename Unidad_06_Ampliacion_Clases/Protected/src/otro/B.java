package otro;

public class B extends A{

	private int z;

	public B(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public int suma() {
		
		return this.z + this.y + super.getX();
		
	}
	
}
