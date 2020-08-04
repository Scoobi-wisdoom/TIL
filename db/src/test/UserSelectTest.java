package test;


import controller.UserController;
import frame.Controller;
import vo.User;

public class UserSelectTest {

	public static void main(String[] args) {
		String id = "id01";
		Controller<String, User> controller = new UserController();
		try {
			System.out.println(controller.get(id));
			System.out.println("Select OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Select Failed");
		}
	}

}
