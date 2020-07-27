package w0724;

import java.util.ArrayList;

public class App3 {

	public static void main(String[] args) {
		Db<String, User> db = new UserDb("192.168.111.1", 1000);
		
		ArrayList<User> list = null;
		
		try {
			list = db.select();
			
			for(User u:list) {
				System.out.println(u);
			}


		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
