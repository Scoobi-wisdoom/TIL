package db;

public class SelectProductTest {

	public static void main(String[] args) {
		Db<Integer, Product> db = new ProductDb("192.168.0.31", "db", "db");
		Product p = new Product(10000, "¹ÙÁö", 20000, 3.4);
		try {
			System.out.println(db.select(p.getId()));
		} catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
