package forwhile;

import java.util.Scanner;

public class Ws4 {
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("프로그램을 시작합니다. 다음의 글자 중 하나를 입력해주세요.");
			System.out.println("A, D, U, R, Q");
			Scanner sc = new Scanner(System.in);
			String input = "";
			input = sc.nextLine();
			
			if (input.equalsIgnoreCase("Q")) {
				sc.close();
				break;
			}
			
			if (input.equalsIgnoreCase("A")) {
				System.out.println("영문 이름을 입력하시오.");
				String en_name = "";
				en_name = sc.nextLine();
				System.out.println("ADD COMPLETE");
				System.out.println("상위 메뉴로 가려면 Q를 누르시오.");
				input = sc.nextLine();
				
				if (input.equalsIgnoreCase("Q")) {
					continue;
				}
			}
			
			if (input.equalsIgnoreCase("D")) {
				System.out.println("삭제할 영문 이름을 입력하시오.");
				String en_name = "";
				en_name = sc.nextLine();
				System.out.println("Delete COMPLETE");
				System.out.println("상위 메뉴로 가려면 Q를 누르시오.");
				input = sc.nextLine();
				
				if (input.equalsIgnoreCase("Q")) {
					continue;
				}
			}
			
			if (input.equalsIgnoreCase("U")) {
				System.out.println("업데이트할 영문 이름을 입력하시오.");
				String en_name = "";
				en_name = sc.nextLine();
				System.out.println("Update COMPLETE");
				System.out.println("상위 메뉴로 가려면 Q를 누르시오.");
				input = sc.nextLine();
				
				if (input.equalsIgnoreCase("Q")) {
					continue;
				}
			}
			
			if (input.equalsIgnoreCase("R")) {
				System.out.println("복구할 영문 이름을 입력하시오.");
				String en_name = "";
				en_name = sc.nextLine();
				System.out.println("Retrieve COMPLETE");
				System.out.println("상위 메뉴로 가려면 Q를 누르시오.");
				input = sc.nextLine();
				
				if (input.equalsIgnoreCase("Q")) {
					continue;
				}
			}
		}
		System.out.println("프로그램을 종료합니다.");
			
	}

}
