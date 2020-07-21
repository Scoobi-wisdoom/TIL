package lotto;

import java.util.Scanner;

public class LottoApp {
	
	public static void main(String args[]) {
		LottoGame lg = new LottoGame();
		int [] user = new int[6];
//		l.matchNum(user);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<6;i++) {
            System.out.printf("%d번 째 숫자를 입력하시오. %n", i + 1);
            String input = sc.nextLine();
            user[i] = lg.manual(input, user, i);
            
            if(user[i]==-1) {
                System.out.println("구간에 맞는 숫자가 아닙니다.");
                i--;
            } else if(user[i]==-2) {
                System.out.println("조건에 맞게 입력해주세요.");
                i--;
            } else if(user[i]==-3) {
                System.out.println("중복된 숫자입니다.");
                i--;
            }
        }
	}

}
