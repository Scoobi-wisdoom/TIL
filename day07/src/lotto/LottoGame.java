package lotto;

import java.util.Random;
import java.util.Arrays;

public class LottoGame {
	int [] luckyNum;
	
	static int play;
	static long total;
	static int win;
	
	public LottoGame() {
		
	}

//############################################################### 여기부터 	
	public int manual(String input, int [] user, int i) {
		int result = 0;
		// 숫자 여부 체크
		char[] check = input.toCharArray();
		for (int j = 0; j < check.length; j++) {
            if (check[j] < '0' || check[j] > '9') {
                result = -2;
                break;
            }
        }
		
		if (result != -2) {
		// 구간 숫자 여부 체크
			result = Integer.parseInt(input);
			
			if (result < 1 || result > 45) {
	            result = -1;
	        } else {
    		// 중복 체크
			if (i > 0) {
				for (int j = 0; j < i; j++) {
					if (result == user[j]) {
						result = -3;
						break;
						}
					}
				} else {
					user[i] = result;
				}
	        }
		

		}
		return result;
	}
	
	public int matchNum(int [] user) {
		int count = 0;
		
		// user의 size와 같은 luckyNum array를 만든다.
		int luckyNum[] = new int[user.length];
		Random r = new Random();
		for (int i=0; i< user.length; i++) {
			luckyNum[i] = r.nextInt(45) + 1;
			if (luckyNum[i] == user[i]) {
				count++;
			}
		}
		return count;
	}
//############################################################### 여기까지	
	
}
