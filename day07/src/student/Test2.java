package student;

public class Test2 {
	
	public static void main(String args[]) {
		Student sts [] = new Student[3];
		Student s1 = new Student("Lee", "100", 20);
		Student s2 = new Student("Kim", "101", 20);
		Student s3 = new Student("Seo", "102", 20);
		double score1 [] = {80, 90, 70, 80};
		s1.setScore(score1);
		double score2 [] = {80, 90, 70, 80};
		s1.setScore(score2);
		double score3 [] = {80, 90, 70, 80};
		s1.setScore(score3);
		sts[0] = s1;
		sts[1] = s2;
		sts[2] = s3;
		
		System.out.println(sts[0]+" "+sts[0].getSum());
		
//		for(int i=0; i<sts.length; i++) {
//			System.out.println(sts[i].getSum());
//		}
	}

}
