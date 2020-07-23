package db2;

public class MariaDbImpl extends Db {
	
	public void analysis() {
		connect();
		System.out.println("MaridaDB analysis");
		close();
	}

	@Override
	public void insert() {
		connect();
		System.out.println("MariaDB Inserted");
		close();

	}

	@Override
	public void update() {
		connect();
		System.out.println("MariaDB Updated");
		close();
	}

	@Override
	public void delete() {
		connect();
		System.out.println("MariaDB Deleted");
		close();

	}

	@Override
	public void select() {
		connect();
		System.out.println("MariaDB Selected");
		close();
	}
	
	@Override
	public void selectAll() {
		connect();
		System.out.println("MariaDB Selected");
		close();

	}

}
