package op;

import java.util.Scanner;

public class Ws3 {

	public static void main(String[] args) {
//		// Scanner 를 통해 한 수를 입력 받는다.
//		System.out.println("Type a number");
//		Scanner sc = new Scanner(System.in);
//		String a = sc.nextLine();
//		sc.close();
//		// 입력받은 세 개의 숫자 중 최댓값을 출력하시오.
//		int a_num = Integer.parseInt(a);
//		int data = 100;
//		// 입력 받은 값이 0보다 작으면 data에 10을 곱하고
//		// 그렇지 않으면 1을 곱한다.
//		
//		data *= ((a_num < 0) ? 10 : 1); 
//		
//		System.out.println(data);		
	
	int fah = 100;
	float cel = (float)5/9 * (fah-32);
	cel = ((int)(cel * 1000) % 10) >= 5 ?
			((int)(cel * 1000) + 10) / 10 :
			(int)(cel * 1000) / 10;
	cel = cel/100;
		
	//float C = ((1000 * (fah - 32) * 5 / 9 + 5) / 10) / 100f;
		
	//System.out.println(C);
	System.out.println("Fahrenheit: "+fah);
	System.out.println("Celcius: "+cel);
	
	}

}
