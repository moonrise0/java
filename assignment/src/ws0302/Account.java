package ws0302;

public class Account {

	private String accNum;
	private String accName;
	private double balance;
	private double rate;
	private String grade;

	public Account() {
		MakeAccountNumber makenum = new MakeAccountNumber();
		this.accNum = "";
	}

	public Account(String accName, double balance) {
		this();
		this.accName = accName;
		this.balance = balance;
	}

	public Account(String accNum, String accName, double balance) {
		this();
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	
	public Account(String accNum, String accName, double balance, double rate) {
		this();
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
		this.rate = rate;
	}
	
	
	public Account( String accName, double balance, double rate, String grade) {
		
		this.accName = accName;
		this.balance = balance;
		this.rate = rate;
		this.grade = grade;
	}
	
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + ", rate=" + rate
				+ ", grade=" + grade + "]";
	}
	

	public void withdraw(double money) {

		if (money <= 0) {
			System.out.println("출금금액을 확인하세요");
			return;

		}
		if (money > this.balance) {

			System.out.println("잔액이 모자랍니다");
			return;

		}
		this.balance = this.balance -= money;
	}

	public void deposit(double money) {
		if (money <= 0) {
			System.out.println("입금금액을 확인 하세요.");
			return; // 
		}

	     this.balance += money;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() { 
		return balance;
	}

}
