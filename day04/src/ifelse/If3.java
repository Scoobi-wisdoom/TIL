package ifelse;

import java.util.Random;

public class If3 {
	public static void main(String[] args) {
		Random r = new Random();
		int num1 = r.nextInt(10) +1;
		int num2 = r.nextInt(10) +1;
		int num3 = r.nextInt(10) +1;
		System.out.println(num1+" "+num2+" "+num3);
		int max = 0;
		int min = 0;
		
//		if (num1 >= num2) {
//			max = num1;
//			min = num2;
//		} else {
//			max = num2;
//			min = num1;
//		}
//		if (max >= num3) {
//			// max ��ȭ ����
//		} else {
//			max = num3;
//		}
//		if (min >= num3) {
//			min = num3;
//		}
		
		max = (num1 >= num2) ? num1 : num2;
		max = (max >= num3) ? max : num3;
		min = (num1 >= num2) ? num2 : num1;
		min = (min >= num3) ? num3 : min;
		
		System.out.println("Max: "+max+" Min: "+min);
	}

	

}
