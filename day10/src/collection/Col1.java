package collection;

import java.util.ArrayList;

public class Col1 {
	
	public static void main(String args[]) {
		int i = 10; // primitive type
		Integer ii = i; // Wrapper Class: objective type cast.
		
		ArrayList<Integer> list = new ArrayList<>(); // Instead of writing int, use Integer.
		list.add(4);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(4);
		
		for(Integer in:list) {				// Instead of Integer in, int in works as well.
			System.out.println(in);
		}
		
		ArrayList<Object> list2 = new ArrayList<>(); // When you want to contain any type in the ArrayList type Object.
		list2.add(1); list2.add(2.1); list2.add("aa");
		
		for(Object ob:list2) {
			System.out.println(ob);
		}
		
		ArrayList<User> list3 = new ArrayList<>();
		list3.add(new User("id01", "pwd01", "Kim"));
		list3.add(new User("id02", "pwd02", "Lee"));
		list3.add(new User("id03", "pwd03", "Seo"));
		
		for(User u:list3) {
			System.out.println(u);
		}
		
	}

}
