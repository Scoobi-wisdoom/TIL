package calc;

import java.util.Scanner;

public class CalcApp {
	
	public static void main(String args[]) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Input number 1");
//		int n1 = Integer.parseInt(s.nextLine());
//		System.out.println("Input number 2");
//		double n2 = Integer.parseInt(s.nextLine());
//		
////		Calc c = new Calc(); // class에서 static이라고 적었기 때문에 가능.
		double sum = Calc.add(10, 20);
		System.out.println(sum);
		
	}

}
