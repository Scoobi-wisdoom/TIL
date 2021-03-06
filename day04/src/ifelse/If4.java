package ifelse;

import java.util.Random;

public class If4 {

	public static void main(String[] args) {
		Random r = new Random();
		int ko = r.nextInt(100) +1;
		int en = r.nextInt(100) +1;
		int ma = r.nextInt(100) +1;
		int si = r.nextInt(100) +1;
		System.out.printf("%d, %d, %d, %d %n", ko, en, ma, si);
		// 평균을 구한다.
		double mean = (double)0;
		mean = (double)(ko + en + ma + si) / 4;
		String grade = "";

		// 90이상: 95이상 A+, 미만이면 A-
		// 80이상: 85이상 B+, 미만이면 B-
		// 70이상: 75이상 C+, 미만이면 C-
		// 60이상: 65이상 D+, 미만이면 D-
		// 60미만 F
		
		if (mean >= 90) {
//			if (mean >= 95) {
//				grade = "A+";
//			} else {
//				grade = "A-";
//			}
			grade = (mean >= 95) ? "A+" : "A-";
		} else if (mean >= 80) {
//			if (mean >= 85) {
//				grade = "B+";
//			} else {
//				grade = "B-";
//			}
			grade = (mean >= 85) ? "B+" : "B-";
		} else if (mean >= 70) {
//			if (mean >= 75) {
//				grade = "C+";
//			} else {
//				grade = "C-";
//			}
			grade = (mean >= 70) ? "C+" : "C-";
		} else if (mean >= 60) {
//			if (mean >= 65) {
//				grade = "D+";
//			} else {
//				grade = "D-";
//			}
			grade = (mean >= 60) ? "D+" : "D-";
		} else {
			grade = "F";
		}
		
		
		// 평균과 성적을 출력하시오.
		System.out.printf("평균: %.2f, 성적: %s %n", mean, grade);
	}

}
