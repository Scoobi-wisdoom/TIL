package workshop2;

import java.util.Random;

public class Test04 {
	
	public static void main(String args[]) {
		int [] arr3 = new int[10];
		Random r = new Random();
		int sum = 0;
		for (int i=0; i<arr3.length; i++) {
			arr3[i] = r.nextInt(10);
			
			// 1. 배열 내의 이전 index의 모든 값들과 같은지를 비교해야 한다.
			// 2. 단 index 0 일 때는 비교하지 않는다.
			// 3. 비교해서 같을 경우, 다시 랜덤 숫자를 생성한다.
			if (i != 0) {
				for (int j = 0; j < i; j++) {
					if (arr3[i] == arr3[j]) {
						i--;
						break;
					}

				}
			}
			
			
		} 
		
		for (int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
			sum += arr3[i];
		}
		System.out.println();
		System.out.println("sum="+sum);
		
		System.out.println("avg="+(double)sum/arr3.length);

	}

}
