package com.test;

import com.biz.UserDb;
import com.frame.Db;
import com.vo.User;

public class UpdateUserTest {

	public static void main(String[] args) {
		Db<String, User> db = new UserDb("127.0.0.1", "db2", "db2");
		User user = new User("pwd_up", "°øup", "id12");
		try {
			db.update(user);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("----------");
			System.out.println("ERROR");
			e.printStackTrace();
		}

	}

}
