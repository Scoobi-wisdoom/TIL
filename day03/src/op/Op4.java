package op;

public class Op4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		int c = 20;
		boolean result;
		result = (a < b) || (a > c++); // caution: double | does not proceed till c++ since a< b is true.
		System.out.println(a+" "+b+" "+c);
		System.out.println(result);
	}

}
