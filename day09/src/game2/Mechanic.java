package game2;

public abstract class Mechanic extends Unit {
	
	protected String parts;

	public Mechanic() {
		super();
	}

	public Mechanic(int x, int y, String parts) {
		super(x, y);
		this.parts = parts;
	}
	
	abstract void repair();

}
