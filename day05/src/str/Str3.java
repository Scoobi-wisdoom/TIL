package str;

import java.util.Arrays;

public class Str3 {
	
	public static void main(String args[]) {
		String email = "jmlee@tonesol.com";
		// id �� domain(tonesol)�� �и��Ͽ� ��Ʈ���� ����ÿ�.
		// id �� domain�� ����Ͻÿ�.
		int idx = 0;
		idx = email.indexOf("@");
		
		String id = email.substring(0, idx);
		String domain = email.substring(idx+1, email.indexOf("."));
		System.out.println("id: "+id);
		System.out.println("domain: "+domain);
		
	}

}
