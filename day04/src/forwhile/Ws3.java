package forwhile;

import java.util.Random;
import java.util.Scanner;

public class Ws3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int count = 0;

		// [1, 100] 구간의 정수를 랜덤으로 생성한다.
		int target_number = r.nextInt(100) + 1;
		System.out.println(target_number);
		
		
		while (true) {
			
			System.out.println("[1, 100] 구간의 정수를 입력하시오.");
			String input = "";
			int input_number = 0;
			
			// 입력을 받는다.
			input = sc.nextLine();
			
			// 입력받은 String에 숫자가 포함되었는지 검사한다. 숫자가 없으면 다시 while을 실행한다.
			if (input.charAt(0) < '0' || input.charAt(0) > '9') {
				System.out.println("숫자를 입력하시오.");
				continue;
			}
			
			// 입력받은 String을 int로 변환한다. 
			// [1, 100] 구간에 속하지 않은 수이면, 다시 while을 실행한다.
			input_number = Integer.parseInt(input);
			if (input_number > 100 || input_number < 1) {
				continue;
			}
			
			// 입력 받은 int가 랜덤으로 생성된 수와 동일한지 검사한다.
			// 동일하면 "정답"을 출력한다.
			// 동일하지 않으면 "오답을 출력한다. 다시 while을 실행한다.
			if (input_number == target_number) {
				System.out.println("정답");
				
			// 정답을 맞춘 횟수를 기록한다.
				count++;
				
				System.out.println();
				System.out.println("게임을 다시 하고 싶으면 '다시 시작'을 입력하시오.");
				String retry = "";
				retry = sc.nextLine();
			
			// "다시 시작"을 누른 경우 랜덤으로 수를 다시 생성한 후에 다시 while을 실행한다.
				if (retry.equals("다시 시작")) {
					target_number = r.nextInt(100) + 1;
					System.out.println(target_number);
					continue;
				}
				break;
			} else {
				System.out.println("오답");
			}
			
		}
		System.out.println("게임을 종료합니다. 정답 횟수: "+count);
		sc.close();
	}
	

}


