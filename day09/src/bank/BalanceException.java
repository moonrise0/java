package bank;

public class BalanceException extends Exception{
	public BalanceException() {
		
	}
	public BalanceException(String msgcode) {
		super(msgcode);
	}
}