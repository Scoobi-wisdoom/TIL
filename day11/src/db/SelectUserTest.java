package db;

public class SelectUserTest {

	public static void main(String[] args) {
		Db<String, User> db = new UserDb("127.0.0.1", "db2", "db2");
		User user = null;
		try {
			user = db.select("id12");
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("----------");
			System.out.println("ERROR");
			e.printStackTrace();
		}

	}

}
