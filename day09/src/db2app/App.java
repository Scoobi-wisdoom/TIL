package db2app;

import db2.Db;
import db2.OracleDbImpl;
import db2.MariaDbImpl;

public class App {

	public static void main(String[] args) {
		
//		Db db = new Db(); // abstract class is not able to instantiate;

		// loose coupling
		Db db = new OracleDbImpl("192.168.11.1", 1000); //This is Db type. It is unable to use OracleDbImpl's methods.
//		Db db = new MariaDbImpl(); 						// This is Db type. It is unable to use MariaDbImpl's methods.
		db.insert(); // Polymorphism
		
		System.out.println();
		if(db instanceof OracleDbImpl) {
			((OracleDbImpl)db).search();
		} else if(db instanceof MariaDbImpl) {
			((MariaDbImpl)db).analysis();
		}

	}

}
