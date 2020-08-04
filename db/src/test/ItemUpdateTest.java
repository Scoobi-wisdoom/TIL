package test;

import controller.ItemController;
import frame.Controller;
import vo.Item;

public class ItemUpdateTest {

	public static void main(String[] args) {
		Item i = new Item(160, "·Õ¼Òµå", 99999);
		Controller<Integer, Item> controller = new ItemController();
		try {
			controller.modify(i);
			System.out.println("Modify OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Modify Failed");
		}
	}

}
