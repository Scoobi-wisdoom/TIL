package ifelse;

import java.util.Random;
public class Switch2 {

	public static void main(String[] args) {
		Random r = new Random();
		String msg = "";
		int i = r.nextInt(13) +1;
		switch(i) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: msg = "31"; break;
		case 4:
		case 6:
		case 9:
		case 11: msg = "30"; break;
		case 2: msg = "28"; break;
		}
		System.out.println(msg);
	}

}
