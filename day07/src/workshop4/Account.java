package workshop4;

public class Account {
	static String account;
	int balance;
	double interestRate;
	
	public Account() {}
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public void setAccount(String account) {
		
	}
	
	public String getAccount() {
		String result = "";
		
		result = "°èÁÂÁ¤º¸: "+account+" ÇöÀçÀÜ¾×: "+balance;
		
		return result;
	}
	
	public int getBalance() {
		int result = 0;
		result = this.balance;
		return result;
	}
	
	public double calculateInterest() {
		double result = 0.0;
		result = balance * interestRate;
		
		return result;
	}
	
	public void deposit(int money) {
	
		if (money <= 0) {
			return;
		}
		balance += money;
	}
	
	public void withdraw(int money) {
		if(money <= 0) {
			return;
		}
		if(money > balance) {
			return;
		}
		
		balance -= money;
	}
	
	@Override
	public String toString() {
		return "Account [account=" + account + ", balance=" + balance + ", interestRate=" + interestRate + "]";
	}
	
	

}
