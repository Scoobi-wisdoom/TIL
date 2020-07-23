package game;

public abstract class Unit {
	protected int x;
	protected int y;
	protected String name;
	
	public Unit() {}
	public Unit(int x, int y, String name) {
		this.x = x;
		this.y = y;
		this.name = name;
	}
	public Unit(String name) {
		this.name = name;
	}
	
	
	abstract void move(int x, int y);
	public void stop() {
		System.out.println(name+" Stopped");
	}

}
