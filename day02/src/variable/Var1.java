package variable;

public class Var1 {

	public static void main(String[] args) {
		boolean bo = true;
		
		int a = 10; // s
		long a2 = 3000000000L; // b
		char c ='a';
		
		double b = 10.1; // b
		float b2 = 10.1F; // s
		
		String s1 = "Result:";
		
		System.out.println(a+","+b);
		System.out.println((int)c);
		System.out.println(a+c); // char is one of a group of int and long
		System.out.println(s1+" "+(int)(a+b));
	}

}
