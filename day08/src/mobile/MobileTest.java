package mobile;

public class MobileTest {

	public static void main(String[] args) {
		
		// ������ Mobile ��ü ����
		Ltab l;
		l = new Ltab("Ltab", 500, "AP-01");
		Otab o;
		o = new Otab("Otab", 1000, "AND-20");
		// ������ ��ü�� ���� ���
		System.out.println(" Mobile		Battery		OS ");
		System.out.println("------------------------------------");
		System.out.println(l);
		System.out.println(o);
		System.out.println();
		
		// ������ Mobile ��ü�� 10�о� ����
		
		// 10�� ���� �� ��ü ���� ���
		System.out.println(" Mobile		Battery		OS ");
		System.out.println("------------------------------------");
		System.out.println(l);
		System.out.println(o);
		System.out.println();
		
		// ������ Mobile ��ü�� 5�о� ��ȭ
		
		// 5�� ��ȭ �� ��ü ���� ���
		System.out.println(" Mobile		Battery		OS ");
		System.out.println("------------------------------------");
		System.out.println(l);
		System.out.println(o);
		System.out.println();

	}

}
