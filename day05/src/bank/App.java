package bank;

public class App {

	public static void main(String[] args) {
	 Account acc = new Account("이말숙 ", 10000);
         System.out.println(acc);
         
         
         acc.withdraw(30000);
         acc.deposit(10000);
         System.out.println(acc);
	}

}
