package arr2;

import java.util.Random;

public class Arr1 {
	
	public static void main(String[] args) {
//		int i = 10; 
//		int a[] = new int[3];
		int a2[][] = new int[4][2];
		// System.out.println(a2.length); // The length of an Array is # of rows.
		// System.out.println(a2[0].length); // The length of an Array's row is # of columns.
		
		for(int i=0; i< a2.length ; i++) {
			for (int j=0; j< a2[i].length ; j++) {
				System.out.printf("a2[%d][%d]=%d \t", i, j, a2[i][j]);
			}
		}
		
		// 1~9 까지의 난수를 배열에 넣고
		Random r = new Random();
		for (int i=0; i< a2.length; i++) {
			for (int j=0; j< a2[i].length; j++) {
				a2[i][j] = r.nextInt(9) + 1;
			}
		}
		
		// 배열 정보를 다시 출력한다.
		System.out.println();
		System.out.println("---------------------------------------------------");
		for (int i=0; i< a2.length; i++) {
			for (int j=0; j< a2[i].length; j++) {
				System.out.printf("a2[%d][%d]=%d \s", i, j, a2[i][j]);
			}
		}
	}

}
