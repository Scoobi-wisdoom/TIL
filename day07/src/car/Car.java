package car;

public class Car {
	int serial;
	String name;
	double size;
	
	static int count;
	
	public Car() {
//		this("KK", 1000); // arguments에 부합하는 constructor를 call함.
	}
	
	public Car(String name, double size) {
		this.serial = ++count;
		this.name = name;
		if(size < 0) {
			return;
		}
		this.size = size;
	}
	
	public Car(int serial, String name, double size) {
		this.serial = serial;
		this.name = name;
		this.size = size;
	}
	
	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Car [serial=" + serial + ", name=" + name + ", size=" + size + "]";
	}

	
	

}
