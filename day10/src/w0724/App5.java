package w0724;

import java.util.ArrayList;

public class App5 {

	public static void main(String[] args) {
		Db<String, Item> db = new ItemDb("192.168.111.1", 1000);
		
		ArrayList<Item> list = null;
		
		try {
			list = db.select();
			
			for(Item i:list) {
				System.out.println(i);
			}


		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
