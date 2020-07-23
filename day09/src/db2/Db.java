package db2;

public abstract class Db {
	protected String ip;
	protected int port;
	
	public Db() {}
	public Db(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	
	protected void connect() {
		System.out.println("[" + ip + "]" + "Connected");
	}
	
	protected void close() {
		System.out.println("[" + ip + "]" + "Closed");
	}
	
	// this is to become concrete(opposite: abstract) in subclasses.
//	public abstract void insert(Object o);
//	public abstract void update(Object o);
//	public abstract void delete(Object o);
//	public abstract void select(Object o);
//	public abstract void selectAll();
	
	public abstract void insert();
	public abstract void update();
	public abstract void delete();
	public abstract void select();
	public abstract void selectAll();
	
}
