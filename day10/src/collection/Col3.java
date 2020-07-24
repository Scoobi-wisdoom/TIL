package collection;

import java.util.HashSet;
import java.util.Random;

public class Col3 {
	
	public static void main(String args[]) {
		HashSet<Integer> set = new HashSet<>();
		// set에 중복되지 않는 숫자 6개를 넣으시오.
		Random r = new Random();
		int i = 0;
		while(true) {
			
			set.add(r.nextInt(6) + 1);
			i++;
			
			if(set.size() > 5)
				break;
		}
		
		// set 정보를 출력하시오.
		for(Integer in: set) {
			System.out.println(i);
		}
		
		System.out.println(set);
	}

}
