package tv;

public class App {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Tv tv1 = new Tv("Tv", 60);
		DvdTv tv2 = new DvdTv("DvdTv", 50);
		LcdTv tv3 = new LcdTv("LcdTv", 70);
		
		factory.repairTv(tv1);
		factory.repairTv(tv2);
		factory.repairTv(tv3);
		
		// All classes of Java inherit Object.
		Object o1 = new Tv();
		Object o2 = new DvdTv();
		Object o3 = new LcdTv();
		Object o4 = new String("aaa");

	}

}
