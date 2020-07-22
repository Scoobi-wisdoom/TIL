package lotto;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class LottoApp {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LottoGame lg = new LottoGame();
        while (true) {
            System.out.println("----------LOTTO GAME----------");
            System.out.println("▶ 수동으로 하실거면 'A'를 입력해주세요.");
            System.out.println("▶ 자동으로 하실거면 'B'를 입력해주세요.");
            System.out.println("▶ 종료하시려면 'Q'를 입력해주세요.");
            System.out.print("▶ ");
            
            String input = sc.nextLine();
            
            int[] user = new int[6];
            
            if (input.equals("Q"))
                break;
            else if (input.equals("A")) {
                // 수동 번호 발급
                while(true) {
                    System.out.println("수동번호를 발급 받으시면 (Y)를");
                    System.out.println("이전 메뉴로 돌아가시려면 (N)를 눌러주세요");
                    input = sc.nextLine();
 
                    if (!lg.returnMenu(input)) {
                        break;
                    } 
                    System.out.println("▶[1, 45] 구간의 숫자를 중복 없이 입력하시오.");
                    for(int i=0;i<6;i++) {
                        System.out.printf("%d번 째 숫자를 입력하시오. %n", i + 1);
                        input = sc.nextLine();
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
                    System.out.println(Arrays.toString(user));
                    System.out.println("▶ 해당 숫자로 하시겠습니까?(Y/N)");
                    input = sc.nextLine();
                    if(!lg.checkChoice(input)) {
                        continue;
                    }
                    int matchNum = lg.matchNum(user);
                    long reward = lg.reward(matchNum);
                    System.out.println("당첨 번호 " + Arrays.toString(lg.luckyNum));
                    System.out.println("당첨 개수 : " + matchNum + "개");
                    System.out.println("당첨금 : " + reward);
                }
 
            } else if (input.equals("B")) {
                // 자동 번호 발급
 
                while(true) {
                    System.out.println("자동번호를 발급 받으시면 (Y)를");
                    System.out.println("이전 메뉴로 돌아가시려면 (N)를 눌러주세요");
                    input = sc.nextLine();
 
                    if (!lg.returnMenu(input)) {
                        break;
                    } 
                    
                    user = lg.random();
 
                    System.out.println(Arrays.toString(user));
                    System.out.println("▶ 해당 숫자로 하시겠습니까?(Y/N)");
                    input = sc.nextLine();
                    if(!lg.checkChoice(input)) {
                        continue;
                    }
                    int matchNum = lg.matchNum(user);
                    long reward = lg.reward(matchNum);
                    System.out.println("당첨 번호 " + Arrays.toString(lg.luckyNum));
                    System.out.println("당첨 개수 : " + matchNum + "개");
                    System.out.println("당첨금 : " + reward);
                    
                }
 
            } else {
                System.out.println("※ ERROR! 잘못된 입력입니다. ※");
        
                continue;
            }
            System.out.println(lg.play + "번 했습니다.");
            System.out.println(lg.win + "번 당첨되었습니다.");
            System.out.println("♬총 당첨금액: " + String.format("%,d", lg.total) + "원");
            // .format 메소드는 큰숫자를 1000단위로 보기 쉽게 하기위해 사용했습니다.
            System.out.println();
 
            // 총 상금 금액
        }
        System.out.println("게임 종료");
        sc.close();
    }
 
}