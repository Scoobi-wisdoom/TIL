package car;

public class Car2 {
	String name;
	String color;
	int size;
	double fuel;
	double fuelSize;
	String scale;
	int passenger;
	double speed;
	double maxSpeed;
	boolean power;

	
	public Car2() {
		
	}
	public Car2(String name, String color, double fuelSize, double maxSpeed) {
		this.name = name;
		this.color = color;
		this.size = 3000;
		this.fuel = 0;
		this.fuelSize = fuelSize;
		this.scale = "Big";
		this.passenger = 5;
		this.speed = 0;
		this.maxSpeed = maxSpeed;
		this.power = false;

	}
	
	public void powerOn() {
		this.power = true;
	}
	public void powerOff() {
		this.power = false;
	}
	public void speedChange(double speedchange) {
		if (this.speed + speedchange > this.maxSpeed) {
			this.speed = this.maxSpeed;
			System.out.println("Alert: Max Speed: "+this.speed);
			return;
		}
		if (this.speed + speedchange < 0) {
			this.speed = 0;
			System.out.println("Alert: Min Speed: "+this.speed);
			return;
		}
		this.speed += speedchange;
	}
	public void fuelUp(double fuelup) {
		if(this.fuel + fuelup <= this.fuelSize && fuelup > 0) {
			this.fuel += fuelup;
		} else {
			System.out.println("Alert Exception ...");
		}
		
	}
	@Override
	public String toString() {
		return "Car2 [name=" + name + ", color=" + color + ", size=" + size + ", fuel=" + fuel + ", fuelSize="
				+ fuelSize + ", scale=" + scale + ", passenger=" + passenger + ", speed=" + speed + ", maxSpeed="
				+ maxSpeed + ", power=" + power + "]";
	}
	

	
}
