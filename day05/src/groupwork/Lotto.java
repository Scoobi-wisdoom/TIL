package groupwork;

import java.util.Scanner;
import java.util.Arrays;

public class Lotto {

	public static void main(String args[]) {
		boolean bool = true;
		while (bool) {
			System.out.println("[1, 45] 구간의 숫자를 중복 없이 입력하시오.");

			// 중복 없는 숫자 6개를 입력받는다.
			// 6개의 숫자로 이루어질 배열을 선언한다.
			int[] user = new int[6];
			Scanner sc = new Scanner(System.in);

			lotto: for (int i = 0; i < 6; i++) {
				System.out.printf("%d번 째 숫자를 입력하시오. %n", i + 1);

				// 먼저 사용자로부터 String으로 입력받는다.
				// 공란을 입력했을 경우 다시 입력을 받는다.
				String user_input = sc.nextLine();
				if (user_input.length() == 0) {
					i--;
					continue lotto;
				}
				sc.close();

				// 입력받은 것이 숫자가 맞는지 체크한다.
				// String을 char array로 변환하여 체크한다.
				char[] check = user_input.toCharArray();
				for (int j = 0; j < check.length; j++) {
					if (check[j] < '0' || check[j] > '9') {
						System.out.println(check[j]);
						System.out.println("조건에 맞게 입력해주세요.");
						i--;
						continue lotto;
					}
				}

				// 입력받은 String을 int로 변환한다.
				int input_num = 0;
				input_num = Integer.parseInt(user_input);

				// 입력받은 숫자가 [1, 45] 구간에 속하는지 체크한다.
				if (input_num < 1 || input_num > 45) {
					System.out.println("구간에 맞는 숫자가 아닙니다.");
					i--;
					continue lotto;
				}

				// 입력받은 숫자 중에 중복된 것이 있는지 검사한다.
				if (i > 0) {
					for (int j = 0; j < i; j++) {
						if (input_num == user[j]) {
							i--;
							continue lotto;
						}
					}
				}

				// 입력받은 숫자를 user에 삽입한다.
				user[i] = input_num;

				// i == 5 가 되는 6번 째 실행에서 다음을 출력한다.
				// 사용자의 선택에 따라 다시 실행할지, 그만둘지 결정한다.
				if (i == 5) {
					System.out.println();
					System.out.println(Arrays.toString(user));

					while (true) {
						System.out.println("입력하신 숫자가 맞습니까? (Y/N)");

						user_input = sc.nextLine();
						if (user_input.equalsIgnoreCase("N")) {
							i = 0;
							i--;
							continue lotto;
						} else if (user_input.equalsIgnoreCase("Y")) {
							break;
						} else {
							// Y, y, N, n 외에 다른 것을 입력했을 경우 다시 입력하라고 나온다.
							System.out.println("잘못 입력했습니다.");
						}
					}

					// 구매확정할 것인지, 이전 메뉴로 돌아갈 것인지 체크한다.
					while (true) {
						System.out.println("구매를 확정하시려면 Y 를, 이전 메뉴로 돌아가고 싶으면 N 을 눌러주세요.");
						user_input = sc.nextLine();
						if (user_input.equalsIgnoreCase("N")) {
							bool = false;
							break;
						} else if (user_input.equalsIgnoreCase("Y")) {
							break;
							// 아무 것도 안 함.
						} else {
							// Y, y, N, n 외에 다른 것을 입력했을 경우 다시 입력하라고 나온다.
							System.out.println("잘못 입력했습니다.");
						}
					}

				} // if i == 5
				

			} // for lotto
			
			

			
		} // 전체  while 루프
		
	}
	
}
