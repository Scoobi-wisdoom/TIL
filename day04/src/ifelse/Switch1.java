package ifelse;

import java.util.Random;

public class Switch1 {

	public static void main(String[] args) {
		Random r = new Random();
		int i = r.nextInt(4) + 1;
		String item = "Prize:";
		switch(i) {
		case 1: item += " phone"; 
		case 2: item += " TV"; 
		case 3: item += " ipad"; 
		case 4: item += " pod"; break;
		default: item += " Next...";
		}
		
		System.out.println(item);
	}

}
