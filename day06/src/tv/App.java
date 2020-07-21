package tv;

public class App {

	public static void main(String[] args) {
//		Tv tv = new Tv();
//		System.out.println(tv.toString());
//		tv.powerOn();
//		tv.channelDown();
//		System.out.println(tv.toString());
		
		int a = 10;
		
		Tv tv2 = new Tv("red", true, 10);
		System.out.println(tv2);
		Tv tv3 = new Tv("black", true, 20);
		System.out.println(tv3.toString());
	}

}
