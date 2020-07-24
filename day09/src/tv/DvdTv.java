package tv;

public class DvdTv extends Tv{

	public DvdTv() {
		super();
	}

	public DvdTv(String name, double size) {
		super(name, size);
	}
	
	public void repair() {
		System.out.println(name+" DVD Repaired.");
	}

	@Override
	public String toString() {
		return "DvdTv [name=" + name + ", size=" + size + "]";
	}
	
}
