package com.test;

import com.biz.UserDb;
import com.frame.Db;
import com.vo.User;

public class DeleteUserTest {

	public static void main(String[] args) {
		Db<String, User> db = new UserDb("127.0.0.1", "db2", "db2");
		User user = new User("id12", "pwd11", "°ø¸»ÀÚ");
		try {
			db.delete(user.getId());
			System.out.println(user.getName()+" " + user.getPwd());
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("----------");
			System.out.println("ERROR");
			e.printStackTrace();
		}

	}

}
