package com.test;

import com.biz.ProductDb;
import com.frame.Db;
import com.vo.Product;

public class DeleteProductTest {

	public static void main(String[] args) {
		Db<Integer, Product> db = new ProductDb("192.168.0.31", "db", "db");
		Product p = new Product(10000, "¹ÙÁö", 20000, 3.4);
		try {
			db.delete(p.getId());
			System.out.println("OK");
		} catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
