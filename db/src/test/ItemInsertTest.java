package test;

import controller.ItemController;
import frame.Controller;
import vo.Item;

public class ItemInsertTest {

	public static void main(String[] args) {
		Item i = new Item("≈ı±∏", 100000);
		Controller<Integer, Item> controller = new ItemController();
		try {
			controller.register(i);
			System.out.println("Register OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Register Failed");
		}
	}

}
