package w0724;

import java.util.ArrayList;

public class UserDb extends Db<String, User> {
	
	
	UserDb() {
		super();
	}
	UserDb(String ip, int port) {
		super(ip, port);
	}
	@Override
	public void insert(User v) throws Exception {
		connect();
		if(v.getId().equals("serom")) {
			close();
			throw new Exception("Duplicate ID...");
		}
		System.out.println("Inserted: "+v);
		close();		
	}
	@Override
	public void update(User v) throws Exception {
		connect();
		System.out.println("Updated: "+v);
		close();		
	}
	@Override
	public void delete(String k) throws Exception {
		connect();
		System.out.println("Deleted: "+k);
		close();
		
	}
	@Override
	public User select(String k) throws Exception {
		User user = null;
		// k °ªÀ» ÀÌ¿ëÇØ¼­ »ç¿ëÀÚ Á¤º¸¸¦ °Ë»öÇÑ´Ù.
		user = new User("id99", "pwd99", "ÀÌ¸»¼÷");
		return user;
	}
	@Override
	public ArrayList<User> select() throws Exception {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("id01", "pwd01", "ÀÌ¸»¼÷"));
		list.add(new User("id02", "pwd02", "±è¸»¼÷"));
		list.add(new User("id03", "pwd03", "Àå¸»¼÷"));
		list.add(new User("id04", "pwd04", "Á¤¸»¼÷"));
		list.add(new User("id05", "pwd05", "È«¸»¼÷"));
				
		return list;
	}
		
}
