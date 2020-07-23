package game2;

public class Tank extends Mechanic {
	
	public Tank() {
		super();
	}

	public Tank(int x, int y, String parts) {
		super(x, y, parts);
	}
	
	@Override
	void move(int x, int y) {
		this.x += 5;
		this.y += 5;

	}

	@Override
	void repair() {
		System.out.println("Tank repaired");
	}
	
	public void changeMode() {
		System.out.println("Tank mode changed with "+parts);
	}


	@Override
	public String toString() {
		return "Tank [parts=" + parts + ", x=" + x + ", y=" + y + "]";
	}
	
	

}
