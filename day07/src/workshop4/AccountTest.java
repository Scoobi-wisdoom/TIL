package workshop4;

public class AccountTest {
	
	public static void main(String args[]) {
		Account account;
		// account ��ü ����
		account = new Account("441-0290-1203", 0, 0.013);
		
		// account �⺻ ���� ���
		System.out.println(account.getAccount());
		
		// account �� 20000�� �Ա�
		account.deposit(20000);
		
		// account ���� ���� ���
		System.out.println(account.getAccount());
		
		// ���� ��� - ���� �ܰ� �������� ������ �� ���� �ݾ��� ����Ѵ�
		System.out.println("����: "+account.calculateInterest());
	}

}
