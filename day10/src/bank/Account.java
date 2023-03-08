package bank;

public class Account {
      private String accNo;
      private double balance;
      public Account() {
    	  this.accNo = MakeAccountNumber.MakeAccNum();
    	  
      }
      
      
      public Account(double balance) throws Exception {
  		  this(); //맨위에
  		  if(balance < 0) {
  			  throw new Exception("ER0001");//예외 객체를 만들어 던진다
  		  }
    	  this.balance = balance;
  	}  
      
      
	public Account(String accNo, double balance) throws Exception {
		if(balance < 0) {
			  throw new Exception("ER0001");//예외 객체를 만들어 던진다
		  }
		this.accNo = accNo;
		this.balance = balance;
	}

    public void widthdraw(double money) throws Exception {
    	
    	if(money <=0) {
    		throw new Exception("EX0002");
    	}
    	if(balance < money) {
    		throw new Exception("EX0003");
    	}
    	
    	balance -= money;
    }
	
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}


	// 실제로는 잘 안쓰이지만 잘 만들어졋는지 보려고
      
      
      
      
      
}
