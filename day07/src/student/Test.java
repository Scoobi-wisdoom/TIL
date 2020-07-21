package student;

import java.util.Arrays;

public class Test {
	
	public static void main(String args[]) {
		Student s1 = new Student("Lee", "100", 20);
		System.out.println(s1); 
		
		double [] score = {80, 90, 70, 80};
		s1.setScore(score);
		System.out.println(s1+" "+Arrays.toString(s1.getScore()));
		
		double sum = s1.getSum();
		double avg = s1.getAvg();
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+avg);
		System.out.println("Level: "+s1.getLevel(avg));
		
		
	}

}
