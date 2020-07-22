package lotto;
 
import java.util.Random;
 
public class LottoGame {
    public int[] luckyNum = new int[6];
    public int play;
    public int total;
    public int win;
 
    public LottoGame() {
        this.luckyNum = random();
    }
    public int[] random() {
        Random r = new Random();
        int rd[] = new int[6];
 
        for (int i = 0; i < rd.length; i++) {
            rd[i] = r.nextInt(45) + 1;
 
            for (int j = 0; j < i; j++) {
                if (rd[i] == rd[j]) {
                    i--;
                    break;
                }
            }
        }
        return rd;
    }
 
    public int manual(String input, int[] user, int i) {
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
            result = Integer.parseInt(input);
            
            // 구간 숫자 여부 체크
            if (result < 1 || result > 45) {
                result = -1;
            } else {
                // 중복 체크
            	if (i>0) {
            		for (int j = 0; j < i; j++) {
                        if (result == user[j]) {
                            result = -3;
                            break;
                        }
                    }
            	}
                
            }
        }
        return result;
    }
 
    public int matchNum(int[] user) {
        int count = 0;
 
        // user의 size와 같은 luckyNum array를 만든다.
 
        for (int i = 0; i < user.length; i++) {
 
            if (luckyNum[i] == user[i]) {
                count++;
            }
        }
        return count;
    }
 
    public boolean returnMenu(String input) {
        if (input.equals("N")) {
            return false;
        } else {
            return true;
        }
    }
 
    public boolean checkChoice(String input) {
        if (input.contentEquals("Y")) {
            return true;
        } else {
            return false;
        }
 
    }
 
    //+등수
    public long reward(int matchNum) {
        Random r = new Random();
        long money = 0;
        this.win++;
        if (matchNum == 6) {
            money = (r.nextInt(6) + 10) * 100_000_000;
        } else if (matchNum == 5) {
            money = 20_000_000;
        } else if (matchNum == 4) {
            money = 3_000_000;
        } else if (matchNum == 3) {
            money = 5_000;
        } else {
            this.win--;
        }
        this.play++;
        this.total += money;
        return money;
    }
 
}