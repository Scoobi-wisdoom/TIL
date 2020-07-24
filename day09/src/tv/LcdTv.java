package tv;

public class LcdTv extends Tv{

	public LcdTv() {
		super();
	}

	public LcdTv(String name, double size) {
		super(name, size);
	}
	
	public void repair() {
		System.out.println(name+" LCD Repaired.");
	}

	@Override
	public String toString() {
		return "LcdTv [name=" + name + ", size=" + size + "]";
	}
	
}
