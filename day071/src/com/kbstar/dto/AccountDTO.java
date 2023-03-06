package com.kbstar.dto;

public class AccountDTO {

	private String accNum;
	private String accName;
	private double balance;

////	public AccountDTO() {
////		MakeAccountNumber makenum = new MakeAccountNumber();
//////		this.accNum = MakeAccountNumber.makeAccNum();
////
////		this.accNum = "";
//	}

//	public AccountDTO(String accName, double balance) {
//		this();
//		this.accName = accName;
//		this.balance = balance;
//	}

	public AccountDTO(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + "]";
	}

	public void withdraw(double money) {

		if (money <= 0) {
			System.out.println("출금금액을 확인하세여");
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
			return; // 0보다 작은 금액이 되면 return으로 끝낸다!
		}

		this.balance = this.balance + money;
//	     this.balance += money;
	}

	public double getBalance() { // 잔액조회
		return balance;
	}

}
