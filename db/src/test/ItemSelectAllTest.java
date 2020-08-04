package test;

import controller.ItemController;
import frame.Controller;
import vo.Item;

public class ItemSelectAllTest {

	public static void main(String[] args) {
		Controller<Integer, Item> controller = new ItemController();
		try {
			System.out.println("Select OK");
			System.out.println(controller.get());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Select Failed");
		}
	}

}
