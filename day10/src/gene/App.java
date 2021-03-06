package gene;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Factory<Macaron> f = new Factory<>();
		Macaron m1 = new Macaron("m1", 1000);
		Macaron m2 = new Macaron("m2", 2000);
		Macaron m3 = new Macaron("m3", 3000);
		f.addItem(m1);f.addItem(m2);f.addItem(m3);
		
		ArrayList<Macaron> list = f.getList();
		
		for(Macaron m:list) {
			System.out.println(m);
		}
	}

}
