package test;

import controller.ItemController;
import frame.Controller;
import vo.Item;

public class ItemSelectTest {

	public static void main(String[] args) {
		int i = 160;
		Controller<Integer, Item> controller = new ItemController();
		try {
			System.out.println("Select OK");
			System.out.println(controller.get(i));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Select Failed");
		}
	}

}
