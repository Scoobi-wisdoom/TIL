package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ItemTest2 {

	public static void main(String[] args) {
		// JDBC Programming
		// 1. Driver Loading
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver Not Found !");
		}
		// 2. Connect
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // @ip:port:version of oracle
		String dbid = "db2";
		String dbpwd = "db2";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, dbid, dbpwd);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("No Connection!");
		}
		// 3. SQL - Prepared Statement
		String sql = "SELECT * FROM ITEMS WHERE ID=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, "id02");  // To replace the nth quotation mark with id01.
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		// 4. Result - Result Set
		ResultSet rset = null;
		Item item = null;
		try {
		rset = pstmt.executeQuery();
		rset.next();
		String id = rset.getNString("ID");
		String name = rset.getNString("NAME");
		int price = rset.getInt("PRICE");
		item = new Item(id, name, price);
		} catch (SQLException e1) {
			System.out.println("ID Not Found");
			e1.printStackTrace();
		}
		
		// 5. Close
		try {
			rset.close();
			pstmt.close();
			con.close();
			System.out.println("End Program..");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(item);


	}

}
