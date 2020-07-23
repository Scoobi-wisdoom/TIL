package game2;

public class Dealer extends Human {
	
	public Dealer() {
		super();
	}

	public Dealer(int x, int y, String tool) {
		super(x, y, tool);
	}
	
	@Override
	void move(int x, int y) {
		this.x += 2;
		this.y += 2;

	}

	@Override
	void heal() {
		System.out.println("I am here to be healed");
	}
	
	public void stimPack() {
		System.out.println(" Stimpacked ... and attack with "+tool);
	}

	@Override
	public String toString() {
		return "Dealer [tool=" + tool + ", x=" + x + ", y=" + y + "]";
	}

	
}
