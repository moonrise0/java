package bank;

public class Account {
         private String accNo;
         private String name;
         private String accHolder;
         private double balance;
		
         
         public Account() {
		}

        
		public Account(String accNo, String name, String accHolder, double balance) {
			this.accNo = accNo;
			this.name = name;
			this.accHolder = accHolder;
			this.balance = balance;
		}


		
		
		
		@Override
		public String toString() {
			return "Account [accNo=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance
					+ "]";
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
				return; // 0보다 작은 금액이 되면 return으로 끝낸다!
			}

			this.balance = this.balance + money;
//		     this.balance += money;
		}

		

	}

        
		
		
         //Constructor - 음수 예외 상황.
         
         
         //계좌 정보 조회
         
         
         
         //잔액 조회
         
         
         
         //입금 - 음수 예외 상황
         
         
         
         //출금 - 잔액 부족 예외 상황, 음수 예외 상황
          
         
         

