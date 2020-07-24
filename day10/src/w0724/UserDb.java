package w0724;

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
			throw new Exception("Dupliate ID...");
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
		
}
