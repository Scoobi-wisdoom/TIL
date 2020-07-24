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
		// balance는 money보다 커야 함.
		if(balance < money) {
			throw new NotEnoughException("ER0002");
//			return;  // return is not needed because of the thrown exception.
		}
		// balance에서 money 만큼이 차감돼야 함.
		balance -= money;
	}
	
//	public String withdraw(double money) {
//		// money > 0
//		String msg = "";
//		if(money <= 0) {
//			msg = "음수 입력";
//			return msg;
//		}
//		// balance는 money보다 커야 함.
//		if(balance < money) {
//			msg = "잔액 부족";
//			return msg;
//		}
//		// balance에서 money 만큼이 차감돼야 함.
//		balance -= money;
//		msg = "정상 출금";
//		return msg;
//	}
	
	public void deposit(double money)  throws Exception{
		// money > 0
		if(money <= 0) {
			new Exception("ED10000");
		}
		// balance에 money 만큼을 더해야 함.
		balance += money;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + ", rate=" + rate + "]";
	}
	
	

}
