package account;

public class Account {
	
	String accNo;
	double balance;
	double rate;
	
	public Account() {
		
	}
	
	public Account(String accNo, double balance, double rate) {
		this.accNo = accNo;
		
		// balance >= 0
		this.balance = balance;
		
		// rate >= 0
		this.rate = rate;
	}
	
	public void withdraw(double money) 
	throws InvalidMoneyException,
		   NotEnoughException {
		// money > 0
		if(money <= 0) {
			throw new InvalidMoneyException("ER0001");
//			return;  // return is not needed because of the thrown exception. 
		}
		// balance�� money���� Ŀ�� ��.
		if(balance < money) {
			throw new NotEnoughException("ER0002");
//			return;  // return is not needed because of the thrown exception.
		}
		// balance���� money ��ŭ�� �����ž� ��.
		balance -= money;
	}
	
//	public String withdraw(double money) {
//		// money > 0
//		String msg = "";
//		if(money <= 0) {
//			msg = "���� �Է�";
//			return msg;
//		}
//		// balance�� money���� Ŀ�� ��.
//		if(balance < money) {
//			msg = "�ܾ� ����";
//			return msg;
//		}
//		// balance���� money ��ŭ�� �����ž� ��.
//		balance -= money;
//		msg = "���� ���";
//		return msg;
//	}
	
	public void deposit(double money)  throws Exception{
		// money > 0
		if(money <= 0) {
			new Exception("ED10000");
		}
		// balance�� money ��ŭ�� ���ؾ� ��.
		balance += money;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + ", rate=" + rate + "]";
	}
	
	

}
