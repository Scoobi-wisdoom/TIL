package game2;

public class Jet extends Mechanic {
	
	public Jet() {
		super();
	}

	public Jet(int x, int y, String parts) {
		super(x, y, parts);
	}
	
	@Override
	void move(int x, int y) {
		this.x += 20;
		this.y += 20;

	}

	@Override
	void repair() {
		System.out.println("Jet repaired");	
	}
	
	public void fly() {
		System.out.println("Fly "+"with "+parts);
	}
	
	@Override
	public String toString() {
		return "Jet [parts=" + parts + ", x=" + x + ", y=" + y + "]";
	}

}
