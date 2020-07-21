package str;

import java.util.Arrays;

public class Str3 {
	
	public static void main(String args[]) {
		String email = "jmlee@tonesol.com";
		// id 와 domain(tonesol)을 분리하여 스트링을 만드시오.
		// id 와 domain을 출력하시오.
		int idx = 0;
		idx = email.indexOf("@");
		
		String id = email.substring(0, idx);
		String domain = email.substring(idx+1, email.indexOf("."));
		System.out.println("id: "+id);
		System.out.println("domain: "+domain);
		
	}

}
