package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class JDBCTest3 {

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
		String dbid = "db";
		String dbpwd = "db";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, dbid, dbpwd);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("No Connection!");
		}
		// 3. SQL - Prepared Statement
		String sql = "INSERT INTO USERS VALUES(?, ?, ?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, "id03"); 		// To replace the nth quotation mark with id01.
			pstmt.setNString(2, "pwd03");
			pstmt.setNString(3, "±è¸»ÀÚ");
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
