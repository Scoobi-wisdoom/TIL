package forwhile;

public class While1 {
	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) {
//			System.out.println(i);
//		}
//		System.out.println("--------------");
		// For
		int count = 0;
		int sum = 0;
		for (int i=1; i<=10; i++) {
			if (i%2 != 0) {
				sum += i;
			}
			count++;
			System.out.println("sum: " + sum);
		}
		System.out.println((float)sum/count);
		System.out.println("---------------");
		
		// while
//		int j = 0;
//		int sum2 = 0;
//		while(j<10) {
//			j++;
//			if (j== 9) {
//				break;
//			}
//			System.out.println(j);
//			sum2 += j;
//			
//		}
//		System.out.println((double)sum2/j);
	}
}
