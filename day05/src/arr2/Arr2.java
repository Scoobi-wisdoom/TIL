package arr2;

public class Arr2 {
	
	public static void main(String[] args) {
		int a2[][] = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30},
				{40, 40, 40, 40, 40}
		};
		int total = 0;
		double average = 0;
		int count = 0;
		
		for (int i=0; i< a2.length; i++) {
			for (int j=0; j < a2[i].length; j++) {
				total += a2[i][j];
				count++;
			}
		}
		average = (double)total/count;

		System.out.println("Sum: "+total);
		System.out.println("AVG: "+average);
	}

}
