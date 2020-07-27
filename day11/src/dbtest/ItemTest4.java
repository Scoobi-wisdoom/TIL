package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class ItemTest4 {

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
		String sql = "UPDATE ITEMS SET NAME=?, PRICE=? WHERE ID=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, "����");
			pstmt.setInt(2, 100000);
			pstmt.setNString(3, "id01");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		// 4. Result - Result Set
		int result = 0;
		try {
			con.close();
			pstmt.close();
			result = pstmt.executeUpdate();
			
		} catch (SQLException e1) {
			System.out.println("Duplicate ID ..");
			e1.printStackTrace();
		}
		System.out.println(result);
		
		// 5. Close
		try {
			pstmt.close();
			con.close();
			System.out.println("End Program..");
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
