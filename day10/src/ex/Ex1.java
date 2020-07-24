package ex;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
//		int a [] = new int[3];
//		// logical error
//		for (int i=0; i<5; i++) {
//			System.out.println(a[i]);
//		}
		Scanner s = new Scanner(System.in);
		System.out.println("Input number");
		int i = Integer.parseInt(s.nextLine());
		int a =10;
		int result = 0;
		try {
			result = a/i;
		} catch(ArithmeticException e) { // catch(Exception e) is also able to deal with this because of polymorphism.
			e.printStackTrace();
			System.out.println("/ by zero.. try again");
			return;
		}
		System.out.println(result);

	}

}
