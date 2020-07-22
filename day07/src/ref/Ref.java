package ref;

public class Ref {
	
	String name;
	Tv tv;
	
	public Ref() {}
	public Ref(String name) {
		this.name = name;
	}
	public Ref(String name, Tv tv) {
		this.name = name;
		this.tv = tv;
	}
	
	public void setTv(Tv tv) {
		this.tv = tv;
	}
	
	public void on() {
		System.out.println("Ref on");
		tv.powerOn();
	}
	
	public void off() {
		System.out.println("Ref off");
		tv.powerOff();
	}
	
	@Override
	public String toString() {
		return "Ref [name=" + name + ", tv=" + tv + "]";
	}
	

}
