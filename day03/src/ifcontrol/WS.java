package ifcontrol;

public class WS {

	public static void main(String[] args) {
		
		
		int sum = 0;
		double avg = 0.0;
		
		System.out.println("Start...");
	
		
		int cnt = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%3 == 0) {
			sum += i;
			cnt++;
		
     		}
			
		}
		avg = sum / (cnt * 1.0);//실수형태로 바꿈 
		System.out.printf("%d, %f", sum, avg);
		System.out.println("End..." + cnt);
		
		
	

	}
}


