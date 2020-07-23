package shape;

public class Rectangle extends Shape {
	
	// x, y
	protected double width;
	protected double height;
	
	public Rectangle() {
	}

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", x=" + x + ", y=" + y + "]";
	}

	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public double getCircum() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}

}
