package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
 
public class FoodDb extends Db<Integer, Food> {
 
    public FoodDb() {
        super();
    }
 
    public FoodDb(String ip, String dbid, String dbpwd) {
        super(ip, dbid, dbpwd);
    }
 
    @Override
    public void insert(Food v) throws Exception {
        Connection con = null;
        con = getConnection();
        PreparedStatement pstmt = null;
        try {
        con = getConnection();
        pstmt = con.prepareStatement(Sql.foodInsert);
        pstmt.setInt(1, v.getId());
        pstmt.setString(2, v.getName());
        pstmt.setInt(3, v.getPrice());
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
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
        con = getConnection();
        pstmt = con.prepareStatement(Sql.foodDelete);
        pstmt.setInt(1, k);
        int result = pstmt.executeUpdate();
        if(result == 0) {
            throw new Exception();
        }
        } catch(Exception e) {
               throw e;
        } finally {
        close(pstmt);
        close(con);
        }
        
    }
 
    @Override
    public void update(Food v) throws Exception {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
        con = getConnection();
        pstmt = con.prepareStatement(Sql.foodUpdate);
        pstmt.setString(1, v.getName());
        pstmt.setInt(2, v.getPrice());
        pstmt.setInt(3, v.getSales());
        pstmt.setInt(4, v.getId());
        pstmt.executeUpdate();
        } catch(Exception e) {
               throw e;
        } finally {
        close(pstmt);
        close(con);
        }
        
    }
 
    @Override
    public Food select(Integer k) throws Exception {
        Food food = null;
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        try {
        con = getConnection();
        pstmt = con.prepareStatement(Sql.foodSelect);
        pstmt.setInt(1, k);
        pstmt.executeUpdate();
        rset = pstmt.executeQuery();    
        rset.next();
        int id = rset.getInt("ID");
        String name = rset.getString("NAME");
        int price = rset.getInt("PRICE");
        int sales = rset.getInt("SALES");
        food = new Food(id, name, price, sales);
        } catch(Exception e) {
               throw e;
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }
        return food;
    }
 
    @Override
    public ArrayList<Food> select() throws Exception {
        ArrayList<Food> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        try {
            con = getConnection();
            pstmt = con.prepareStatement(Sql.foodSelectAll);
            rset = pstmt.executeQuery();
            while(rset.next()) {
                Food food = null;
                int id = rset.getInt("ID");
                String name = rset.getString("NAME");
                int price = rset.getInt("PRICE");
                int sales = rset.getInt("SALES");
                food = new Food(id, name, price, sales);
                list.add(food);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }
        return list;
    }
    
 
}
