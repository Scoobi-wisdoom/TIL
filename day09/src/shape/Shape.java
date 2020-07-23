package shape;

public abstract class Shape {
	
	// coordinates
	protected int x;
	protected int y;
	
	public Shape() {}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	abstract public double getArea();
	abstract public double getCircum();
	

}
