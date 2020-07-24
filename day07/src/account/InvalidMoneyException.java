package account;

public class InvalidMoneyException extends Exception{
	public InvalidMoneyException () {
		super();
	}
	public InvalidMoneyException(String msg) {
		super(msg);
	}

}
