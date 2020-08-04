package test;

import controller.ItemController;
import frame.Controller;
import vo.Item;

public class ItemDeleteTest {

	public static void main(String[] args) {
		Integer i = 0;
		i = 166;
		Controller<Integer, Item> controller = new ItemController();
		try {
			controller.remove(i);
			System.out.println("Delete OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Delete Failed");
		}
	}

}
