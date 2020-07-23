package game2;

public class Medic extends Human {
	
	public Medic() {
		super();
	}

	public Medic(int x, int y, String tool) {
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
	
	public void support() {
		System.out.println("support with "+tool);
	}

	@Override
	public String toString() {
		return "Medic [tool=" + tool + ", x=" + x + ", y=" + y + "]";
	}

}
