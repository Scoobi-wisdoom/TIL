package car;

public class Car {
	int serial;
	String name;
	double size;
	
	static int count;
	
	public Car() {
		
	}
	
	public Car(String name, double size) {
		this.serial = ++count;
		this.name = name;
		this.size = size;
	}
	
	public Car(int serial, String name, double size) {
		this.serial = serial;
		this.name = name;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Car [serial=" + serial + ", name=" + name + ", size=" + size + "]";
	}

	
	

}
