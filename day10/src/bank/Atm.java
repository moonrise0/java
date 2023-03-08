package bank;

public class Atm {

	
	  public static void main(String[] args) {
		 Account acc1 = null;
		  try {
		     acc1 = new Account(10000);
		    System.out.println(acc1);//정상이면
		    acc1.widthdraw(20000);
		} catch (Exception e) {
//		
			System.out.println(MakeMessage.MakeMessage(e.getMessage()));	
			System.out.println("고객님" + e.getMessage());
		}
	  }
	
	
	
}
