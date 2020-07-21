package guess;
 
import java.util.Scanner;
 
public class GameApp {
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		Game g = new Game();
		int num = g.checkNum(input);
		if (num == -1) {
			System.out.println("문자가 입력되었습니다.");
			return;
		} else if (num == -2) {
			System.out.println("올바른 숫자가 아닙니다.");
			return;
			

			
		}

	}
}