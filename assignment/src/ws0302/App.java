package ws0302;

public class App {

	public static void main(String[] args) {
	
		Account acc[] = new Account[6];
		
	 acc[0] = new Account("james1", 10000, 0.35, "VIP");
	 acc[1] = new Account("james2", 10000, 0.45, "GOLD");
	 acc[2] = new Account("james3", 10000, 0.55, "SIVER");
	 acc[3] = new Account("james4", 10000, 0.15, "GOLD");
	 acc[4] = new Account("james5", 10000, 0.28, "SIVER");
	 acc[5] = new Account("james6", 10000, 0.31, "VIP");
	 
	 
	 for (Account a :acc ) {
	     System.out.printf("accname:  %s \n" , a.getAccName());
	     System.out.printf("balance: %f \n"  ,a.getBalance());
	     System.out.printf("rate:  %f \n" ,a.getRate());
	     System.out.printf("grade: %s \n", a.getGrade());
	
	        int sum = 0;
			int cnt = 0;
	 }
		
	 for (Account a :acc ) {
	     System.out.printf("accname:  %s \n" , a.getAccName());
	     System.out.printf("balance: %f \n"  ,a.getBalance());
	     System.out.printf("rate:  %f \n" ,a.getRate());
	     System.out.printf("grade: %s \n", a.getGrade());
	
	        int sum = 0;
			int cnt = 0;
	 

	 
			for (int i = 0; i < acc.length; i++) {
				if (acc.equals("VIP")) {
					sum += a.getBalance();
					cnt++;
				}
				
				System.out.printf("vip잔액의 합 %s" , sum);
				System.out.printf("vip 잔액 평균 %f", (double) sum / cnt );
			}
	
			
	     
		
	 }
	}}
