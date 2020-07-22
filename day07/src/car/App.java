package car;

public class App {

	public static void main(String[] args) {
//		Car c1 = new Car("K1", 1000);
//		Car c2 = new Car("K1", 2000);
//		Car c3 = new Car("K1", 3000);
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
		
		// c1의 reference를  0x111이라고 하자
		Car c1 = new Car("K1", 1000);
		c1.setSize(2000);
		
		// c2의 reference를  0x222이라고 하자
		Car c2 = new Car("K1", 1000);
		c2.setSize(2000);
		System.out.println(c1);

	}

}
