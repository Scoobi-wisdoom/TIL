package db;

public class DbImpl {
	private String ip;
	private int port;
	
	public DbImpl() {}
	public DbImpl(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	
	// encapsulated
	private void connect() {
		System.out.println(ip+"*********** Connected");
	}
	
	// encapsulated	
	private void close() {
		System.out.println(ip+"*********** Closed");
	}
	
	public void insert(User u) {
		connect();
		System.out.println("Inserted: "+u.getId()+" "+u.getPwd()+" "+u.getName());
		close();
	}
	
	public void delete(String id) {
		connect();
		System.out.println("Deleted: " + id);
		close();
	}
	
	public void update(User u) {
		connect();
		System.out.println("Updated: "+u.getId()+" "+u.getPwd()+" "+u.getName());
		close();
	}
	
	public User select(String id) {
		connect();
		System.out.println("Selected: " + id);
		User user = new User(id, "pwd01", "Lee");
		close();
		return user;
	}
	
	public User[] select() {
		connect();
		User users[] = new User[3];
		users[0] = new User("id01", "pwd01", "lee");
		users[1] = new User("id02", "pwd02", "kim");
		users[2] = new User("id02", "pwd03", "seo");
		close();
		return users;
	}

}
