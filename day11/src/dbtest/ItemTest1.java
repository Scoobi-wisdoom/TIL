package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ItemTest1 {

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
		String sql = "SELECT * FROM ITEMS";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		// 4. Result - Result Set
		ResultSet rset = null;
		ArrayList<Item> list = new ArrayList<>();
		try {
			rset = pstmt.executeQuery();
			while(rset.next()) {
				String id = rset.getNString("ID"); 
				String name = rset.getNString("NAME");
				int price = rset.getInt("PRICE");
				
				Item item = new Item(id, name, price);
				list.add(item);
			}
		} catch (SQLException e1) {
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
		
		for(Item i:list) {
			System.out.println(i);
		}

	}

}
