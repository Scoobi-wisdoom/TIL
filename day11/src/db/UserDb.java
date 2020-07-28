package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDb extends Db<String, User> {
	
	public UserDb() {
		super();
	}

	public UserDb(String ip, String dbid, String dbpwd) {
		super(ip, dbid, dbpwd);
	}

	public UserDb(String dbid, String dbpwd) {
		super(dbid, dbpwd);
	}

	@Override
	public void insert(User v) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
		con = getConnection();
		pstmt = con.prepareStatement(Sql.userInsert);
		pstmt.setNString(1, v.getId());
		pstmt.setNString(2, v.getPwd());
		pstmt.setNString(3, v.getName());
		pstmt.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
		close(pstmt);
		close(con);
		}
	
	}

	@Override
	public void delete(String k) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
		con = getConnection();
		pstmt = con.prepareStatement(Sql.userDelete);
		pstmt.setNString(1, k);
		int result = pstmt.executeUpdate();
		
		if(result == 0) {
			throw new Exception(); // forced exception
		}
		
		} catch(Exception e) {
			throw e;
		} finally {
		close(pstmt);
		close(con);
		}
	
	}

	@Override
	public void update(User v) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
		con = getConnection();
		pstmt = con.prepareStatement(Sql.userUpdate);
		pstmt.setNString(1, v.getPwd());
		pstmt.setNString(2, v.getName());
		pstmt.setNString(3, v.getId());
		pstmt.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
		close(pstmt);
		close(con);
		}
	}

	@Override
	public User select(String k) throws Exception {
		User user = new User();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.userSelect);
			pstmt.setNString(1, k);
			rset = pstmt.executeQuery();
			rset.next();
			String id = rset.getNString("ID");
			String pwd = rset.getNString("PWD");
			String name = rset.getNString("NAME");
			user = new User(id, pwd, name);
			
		} catch(Exception e) {
			throw e;
		} finally {
			close(rset);
			close(pstmt);
			close(con);
		}
		
		
		
		return user;
	}

	@Override
	public ArrayList<User> select() throws Exception {
		ArrayList<User> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.userSelectAll);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				String id = rset.getNString("ID");
				String pwd = rset.getNString("PWD");
				String name = rset.getNString("NAME");
				User user = new User(id, pwd, name);
				list.add(user);
			}
		} catch(Exception e) {
			throw e;
		} finally {
			close(rset);
			close(pstmt);
			close(con);
		}
		
		return list;
	}
	

}
