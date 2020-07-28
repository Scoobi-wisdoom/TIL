package db;

import java.util.ArrayList;

public class SelectAllProductTest {

	public static void main(String[] args) {
		Db<Integer, Product> db = new ProductDb("192.168.0.31", "db", "db");
		ArrayList<Product> list = null;
		try {
			list = db.select();
			System.out.println(list);
		} catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
