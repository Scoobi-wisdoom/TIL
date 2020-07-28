package test;

import java.util.ArrayList;

import com.biz.ProductDb;
import com.frame.Db;
import com.vo.Product;


public class Test {

	public static void main(String[] args) {
		Db<Integer, Product> db = new ProductDb("192.168.0.31", "db", "db");
		ArrayList<Product> list = null;
		try {
			list = db.select();
			for(Product p:list) {
				System.out.println(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
