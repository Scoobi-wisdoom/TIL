package forwhile;

import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input A Number");
			String number = "";
			number = sc.nextLine();
			if (number.equals("q")) {
				sc.close();
				break;
			}
			System.out.println(number);
		}
		System.out.println("Goodbye");
		
	}
}
