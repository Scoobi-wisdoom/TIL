package game2;

public abstract class Human extends Unit {

	protected String tool;

	public Human() {
		super();
	}

	public Human(int x, int y, String tool) {
		super(x, y);
		this.tool = tool;
	}
	
	abstract void heal();

}
