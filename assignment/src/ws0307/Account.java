package ws0307;

public class Account {
	private String accNo;
	private String name;
	private String accHolder;
	private double balance;
	

	public Account() {
	}
	
	public Account(String accNo, String name, String accHolder, double balance) throws MinusException {
		if (balance < 0) {
			throw new MinusException("금액오류");
		}
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}
	
	
	public void deposit(double money) throws MinusException {
		if (money <= 0) {
			throw new MinusException("금액 오류");
		}
		this.balance += money;
	}
	
	
	
	public void withdraw(double money) throws MinusException, BalanceException {
		if (money <= 0) {
			throw new MinusException("금액 오류");
		}
		if (this.balance < money) {
			throw new BalanceException("잔액오류: " + (balance-= money) + "원이 부족합니다.");
		}
		this.balance -= money;
	}
}