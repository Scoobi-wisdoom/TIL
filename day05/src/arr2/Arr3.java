package arr2;

public class Arr3 {
	
	public static void main(String[] args) {
		int a2[][] = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30},
				{40, 40, 40, 40, 40}
		};
		int sum = 0;
		
		// sum of diagonal
		ou:
		for (int i=0; i< a2.length; i++) {
			for (int j=0; j< a2[i].length; j++) {
				if (i == j) {
					sum += a2[i][j];
				}
				if ( i == 2 && j ==2) {
					break ou;
				}
			}
		}
		
		System.out.println("Sum of diagonal: "+sum);
	}

}
