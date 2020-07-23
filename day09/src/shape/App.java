package shape;

public class App {

	public static void main(String[] args) {
		Shape s = new Rectangle(10, 10, 7, 8);
		System.out.println(s);
		System.out.println(s.getArea());
		System.out.println(s.getCircum());

	}

}
