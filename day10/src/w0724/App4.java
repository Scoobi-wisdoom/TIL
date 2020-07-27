package w0724;

public class App4 {

	public static void main(String[] args) {
		Db<String, Item> db = new ItemDb("192.168.111.1", 1000);
		Item item = null;
		try {
			item = db.select("it04");
			System.out.println(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
