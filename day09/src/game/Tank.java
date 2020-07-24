package game;

public class Tank extends Unit {
	
	public Tank() {
		super();
	}

	public Tank(int x, int y, String name) {
		super(x, y, name);
	}

	public Tank(String name) {
		super(name);
	}

	@Override
	void move(int x, int y) {
		this.x += 3;
		this.y += 3;

	}
	
	public void changeMode() {
		System.out.println(name+" mode changed");
	}

	@Override
	public String toString() {
		return "Tank [x=" + x + ", y=" + y + ", name=" + name + "]";
	}

	@Override // This method is inherited from the abstract super class but this is not a method of this class.
	void stimPack() {
		// TODO Auto-generated method stub
		
	}


}
