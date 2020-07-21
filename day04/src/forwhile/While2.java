package forwhile;

public class While2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 9) {
				break;
			}
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
			
		}
		int j = 0;
		while (j < 9) {
			j++;
			if (j % 2 == 0) {
				continue;
			}
			if (j == 9) {
				break;
			}
			System.out.println(j);
		}

	}
}
