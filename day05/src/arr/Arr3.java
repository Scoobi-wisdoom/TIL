package arr;

import java.util.Arrays;

public class Arr3 {

	public static void main(String[] args) {
		int a[] = {10, 30, 20, 40};
		System.out.println(Arrays.toString(a));
		
		// 배열의 최댓값과 최솟값을 구하자
		int max = 0;
		int min = a[0];
		for (int i=0; i<a.length; i++) {
			if (a[i] >= max) {
				max = a[i];
			} 
			if (a[i] <= min) {
				min = a[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}

}
