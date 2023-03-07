package ws0307;

public class BalanceException extends Exception{
	public BalanceException() {
		
	}
	public BalanceException(String msgcode) {
		super(msgcode);
	}
}