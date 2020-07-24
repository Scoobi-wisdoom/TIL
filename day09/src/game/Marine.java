package game;

public class Marine extends Unit {
	// x, y, name
	
	public Marine() {
		super();
	}
	public Marine(int x, int y, String name) {
		super(x, y, name);
	}
	public Marine(String name) {
		super(name);
	}

	@Override
	void move(int x, int y) {
		this.x += x;
		this.y += y;

	}
	
	public void stimPack() {
		System.out.println(name+" Stimpacked ...");
	}
	
	@Override
	public String toString() {
		return "Marine [x=" + x + ", y=" + y + ", name=" + name + "]";
	}
	
	// This method is inherited from the abstract super class but this is not a method of this class.
	@Override
	void changeMode() {
		// TODO Auto-generated method stub
		
	}
	
	

}
