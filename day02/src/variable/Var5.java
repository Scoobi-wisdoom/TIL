package variable;

public class Var5 {

	public static void main(String[] args) {
		int a = 10;
		String s1 = "ABC";
		String s2 = s1 + 10;
		int oct = 0120;
		int hex = 0x120;
		
		char c = 'A'; // ascii 65
		
		System.out.printf("Result: %d, %o \n", oct, oct);
		System.out.printf("Result: %d, %x \n", hex, hex);
		System.out.printf(s2);
	}

}
