package w0727;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import db.Sql;

public class ProductDb extends Db<Integer, Product>{
	
	public ProductDb() {
		super();
	}

	public ProductDb(String ip, String dbid, String dbpwd) {
		super(ip, dbid, dbpwd);
	}

	public ProductDb(String dbid, String dbpwd) {
		super(dbid, dbpwd);
	}

	@Override
	public void insert(Product v) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(Sql.userInsert);
			pstmt.setInt(1, v.getId());
			pstmt.setNString(2, v.getName());
			pstmt.setInt(3, v.getPrice());
			pstmt.setDouble(4, v.getRate());
			pstmt.setDate(5, v.getRegdate());
			pstmt.executeUpdate();
			} catch(Exception e) {
				throw e;
			} finally {
			close(pstmt);
			close(con);
			}

		
	}

	@Override
	public void delete(Integer k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product select(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> select() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
