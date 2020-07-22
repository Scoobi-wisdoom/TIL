package mobile;

public class MobileTest {

	public static void main(String[] args) {
		
		// 각각의 Mobile 객체 생성
		Ltab l;
		l = new Ltab("Ltab", 500, "AP-01");
		Otab o;
		o = new Otab("Otab", 1000, "AND-20");
		// 생성된 객체의 정보 출력
		System.out.println(" Mobile		Battery		OS ");
		System.out.println("------------------------------------");
		System.out.println(l);
		System.out.println(o);
		System.out.println();
		
		// 각각의 Mobile 객체에 10분씩 충전
		int time1 = 10;
		l.charge(time1);
		o.charge(time1);
		System.out.printf("%d분 충전%n", time1);
		
		// 10분 충전 후 객체 정보 출력
		System.out.println(" Mobile		Battery		OS ");
		System.out.println("------------------------------------");
		System.out.println(l);
		System.out.println(o);
		System.out.println();
		
		// 각각의 Mobile 객체에 5분씩 통화
		int time2 = 5;
		l.operate(time2);
		o.operate(time2);
		System.out.printf("%d분 통화%n", time2);
		
		// 5분 통화 후 객체 정보 출력
		System.out.println(" Mobile		Battery		OS ");
		System.out.println("------------------------------------");
		System.out.println(l);
		System.out.println(o);
		System.out.println();

	}

}
