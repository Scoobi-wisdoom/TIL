package arr;

import java.util.Arrays;
import java.util.Random;

public class Arr2 {
	
	public static void main(String arg[]) {
		int a[] = new int[5];  // 0, 1, 2, 3, 4
		Random r = new Random();
		int sum = 0;
				
		for (int i=0; i<a.length; i++) {
			a[i] = r.nextInt(9) + 1;
		}

		for (int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println("Sum: "+sum);
		System.out.println("Mean: :"+(double)sum/a.length);
	}

}
