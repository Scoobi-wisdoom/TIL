package collection;

import java.util.HashSet;
import java.util.Random;

public class Col3 {
	
	public static void main(String args[]) {
		HashSet<Integer> set = new HashSet<>();
		// set�� �ߺ����� �ʴ� ���� 6���� �����ÿ�.
		Random r = new Random();
		int i = 0;
		while(true) {
			
			set.add(r.nextInt(6) + 1);
			i++;
			
			if(set.size() > 5)
				break;
		}
		
		// set ������ ����Ͻÿ�.
		for(Integer in: set) {
			System.out.println(i);
		}
		
		System.out.println(set);
	}

}
