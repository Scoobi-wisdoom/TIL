package op;

public class Op5 {

	public static void main(String[] args) {
//		char c = 'A';
//		boolean result = ('0' <= c && c <= '9');
//		System.out.println(result);
		
		char d = 'A';
		boolean result1 = ('a' <= d && d <= 'z') || ('A' <= d && d <= 'Z');
		System.out.println(result1);
		
		byte b =10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(c);
		
	}

}
