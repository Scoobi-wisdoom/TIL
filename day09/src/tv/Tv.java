package tv;

public class Tv {
	String name;
	double size;
	
	public Tv() {}
	public Tv(String name, double size) {
		super();
		this.name = name;
		this.size = size;
	}
	
	public void repair() {
		System.out.println(name+" Tv Repaired.");
	}
	
	@Override
	public String toString() {
		return "Tv [name=" + name + ", size=" + size + "]";
	}
	
	
}
