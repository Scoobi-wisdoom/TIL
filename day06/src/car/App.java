package car;

public class App {
	
//	public static void main(String[] args) {
//		Car c1 = new Car("K1", "red", 80, 15.7);
//		System.out.println(c1.toString());
//		int gas = c1.getGas();
//		System.out.println("Gas Level: "+ gas);
//		
//		c1.addGas(20);
//		System.out.println(c1.toString());
//		c1.addGas(30);
//		System.out.println(c1.toString());
//		c1.go(20.0);
//		c1.stop();
//		System.out.println(c1.toString());
//	}
	
	public static void main(String args[]) {
		Car2 c2 = new Car2("Benz", "white", 200, 300);
		System.out.println(c2.toString());
		c2.powerOn();
		System.out.println(c2.toString());
		c2.fuelUp(30);
		System.out.println(c2.toString());
		c2.fuelUp(170);
		System.out.println(c2.toString());
		c2.fuelUp(1);
		System.out.println(c2.toString());
		c2.fuelUp(-1);
		System.out.println(c2.toString());
		c2.speedChange(200);
		System.out.println(c2.toString());
		c2.speedChange(100);
		System.out.println(c2.toString());
		c2.speedChange(1);
		System.out.println(c2.toString());
		c2.speedChange(-1100);
		System.out.println(c2.toString());

		
	}

}
