package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import frame.Dao;
import frame.Sql;
import vo.Item;

public class ItemDao extends Dao<Integer, Item> {

	@Override
	public void insert(Connection con, Item v) throws Exception {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(Sql.itemInsert);
			pstmt.setString(1, v.getName());
			pstmt.setInt(2, v.getPrice());
			pstmt.executeUpdate();
		}catch (Exception e) {
			throw e;
		}finally {
			close(pstmt);
		}
		
		
	}

	@Override
	public void delete(Connection con, Integer k) throws Exception {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(Sql.itemDelete);
			pstmt.setInt(1, k);
			pstmt.executeUpdate();
		}catch (Exception e) {
			throw e;
		}finally {
			close(pstmt);
		}
		
	}

	@Override
	public void update(Connection con, Item v) throws Exception {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(Sql.itemUpdate);
			pstmt.setString(1, v.getName());
			pstmt.setInt(2, v.getPrice());
			pstmt.setInt(3, v.getId());
			pstmt.executeUpdate();
		}catch (Exception e) {
			throw e;
		}finally {
			close(pstmt);
		}
		
		
	}

	@Override
	public Item select(Connection con, Integer k) throws Exception {
		Item item = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			pstmt = con.prepareStatement(Sql.itemSelect);
			pstmt.setInt(1, k);
			rset = pstmt.executeQuery();
			rset.next();
			int id = rset.getInt("ID");
			String name = rset.getString("NAME");
			int price = rset.getInt("PRICE");
			Date regdate = rset.getDate("REGDATE");
			item = new Item(id, name, price, regdate);
		}catch (Exception e) {
			throw e;
		}finally {
			close(rset);
			close(pstmt);
		}
		return item;
	}

	@Override
	public ArrayList<Item> select(Connection con) throws Exception {
		ArrayList<Item> arr = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			pstmt = con.prepareStatement(Sql.itemSelectAll);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				int id = rset.getInt("ID");
				String name = rset.getString("NAME");
				int price = rset.getInt("PRICE");
				Date regdate = rset.getDate("REGDATE");
				Item item = new Item(id, name, price, regdate);
				arr.add(item);
			}
		}catch (Exception e) {
			throw e;
		}finally {
			close(pstmt);
		}
		return arr;
	}

}
