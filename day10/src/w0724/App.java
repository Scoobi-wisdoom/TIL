package w0724;

public class App {

	public static void main(String[] args) {
		Db db = new UserDb("192.168.111.1", 1000);
		User user = new User("serom", "name", "Lee");
		try {
			db.insert(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			db.delete("id01");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Delete Error ..!");
		}
	}

}
