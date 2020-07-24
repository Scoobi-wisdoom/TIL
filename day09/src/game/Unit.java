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
	abstract void stimPack();  // This method is to be a method of one of the subclasses;
	abstract void changeMode(); // This method is to be a method of one of the subclasses;
	public void stop() {
		System.out.println(name+" Stopped");
	}

}
