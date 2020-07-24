package collection;

import java.util.HashMap;
import java.util.Set;

public class Col4 {

	public static void main(String[] args) {
		HashMap<String, User> map = new HashMap<>();
		map.put("id01", new User("id01", "pw01", "Lee"));
		map.put("id02", new User("id02", "pw02", "Kim"));
		map.put("id03", new User("id03", "pw03", "Seo"));
		map.put("id03", new User("id03", "xxx", "Seo"));
		
		map.remove("id03");
		User user = map.get("id01");
		System.out.println(user);
		System.out.println("----------------------------------------------");
		
		Set<String> keys = map.keySet(); 	// map.keySet() returns Set type. So there is no order.
		for(String s:keys) {
			User u = map.get(s);
			System.out.println(u);
		}

	}

}
