package op;

import java.util.Scanner;

public class Ws1 {

	public static void main(String[] args) {
		// Scanner 를 통해 두 수를 입력 받는다.
		System.out.println("Type a number");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("Type another number");
		String b = sc.nextLine();
		
		// 정수 형으로 변경하여 합을 구한다.
		int result = Integer.parseInt(a) + Integer.parseInt(b);
		sc.close();
		
		// 합의 수가 10 보다 같거나 작으면 "SMALL" 
		// 10보다 크면 "BIG"이라고 출력한다.
		String str = "";
		str = (result <= 10) ? "SMALL" : "BIG";
		System.out.println(str);
	}

}
