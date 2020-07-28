package com.test;

import java.util.ArrayList;

import com.biz.ProductDb;
import com.frame.Db;
import com.vo.Product;

public class SelectAllProductTest {

	public static void main(String[] args) {
		Db<Integer, Product> db = new ProductDb("192.168.0.31", "db", "db");
		ArrayList<Product> list = null;
		try {
			list = db.select();
			System.out.println(list);
		} catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
