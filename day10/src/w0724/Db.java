package w0724;

import java.util.ArrayList;

public abstract class Db<K, V> {
	protected String ip;
	protected int port;
	
	public Db() {}
	public Db(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	
	public void connect() {
		System.out.println(ip+" Connected");
	}
	
	public void close() {
		System.out.println(ip+" Closed");
	}
	
	abstract public void insert(V v) throws Exception;
	abstract public void update(V v) throws Exception;
	abstract public void delete(K k) throws Exception;
	abstract public V select(K k) throws Exception;
	abstract public ArrayList<V> select() throws Exception;
}
