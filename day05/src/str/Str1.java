package str;

public class Str1 {
	
	public static void main(String args[]) {
		char c = 'A'; // 65
		int i = 10;
		
		int result = c + i; // 75
		if (c > i) {
			System.out.println("OK");
		}
		
		String s1 = "A";
		String s2 = new String("A");

		String s3 = "A";
		String s4 = new String("A");
		
			
//		if (s2 == s4) {		// reference를 비교
//			System.out.println("s2==s4");
//		}
		if (s1.equals(s2)) { // 글자를 비교
			System.out.println("s1==s2");
		}
	}

}
