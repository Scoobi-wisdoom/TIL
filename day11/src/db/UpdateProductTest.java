package db;

public class UpdateProductTest {

	public static void main(String[] args) {
		Db<Integer, Product> db = new ProductDb("192.168.0.31", "db", "db");
		Product p = new Product(10000, "¿Ê", 20000, 3.4);
		try {
			db.update(p);
			System.out.println("OK");
		} catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
