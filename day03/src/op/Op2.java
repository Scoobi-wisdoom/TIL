package op;

public class Op2 {

	public static void main(String[] args) {
		int i = 10;
		int j = i++;
		System.out.println(i+" "+j);
		int result = -i;
		
		double d = 10.6;
		int k = (int)d;
		System.out.println(k);
		
		int a = 8;
		float b = 1.6f;
		int result1 = (int)(a / b);
		System.out.println(result1);
		
		byte b1 = 100;
		byte b2 = 100;
		byte result2 = (byte) (b1 + b2);
		
		int big = 1000000;
		int big1 = 2000000;
		long result3 = 1L * big * big1; // big * big1 * 1L is not an answer 
		System.out.println(result3);
	}

}
