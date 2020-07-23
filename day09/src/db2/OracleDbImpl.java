package db2;

public class OracleDbImpl extends Db {
	
	// ip, port
	
	public OracleDbImpl() {}
	public OracleDbImpl(String ip, int port) {
		super(ip, port);
	}
	
	public void search() {
		connect();
		System.out.println("OracleDB Searched");
		close();
	}

	@Override
	public void insert() {
		connect();
		System.out.println("OracleDB Inserted");
		close();

	}

	@Override
	public void update() {
		connect();
		System.out.println("OracleDB Updated");
		close();
	}

	@Override
	public void delete() {
		connect();
		System.out.println("OracleDB Deleted");
		close();

	}

	@Override
	public void select() {
		connect();
		System.out.println("OracleDB Selected");
		close();
	}
	
	@Override
	public void selectAll() {
		connect();
		System.out.println("OracleDB Selected");
		close();

	}

}
