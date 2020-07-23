package game2;

public abstract class Unit {
	protected int x;
	protected int y;
	
	public Unit() {}
	public Unit(int x, int y) {
		this.x = x;
		this.y = y;
	}
		
	
	public void stop() {
		System.out.print("Stop!");
	}
	
	abstract void move(int x, int y);
	

}
