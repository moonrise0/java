package ifcontrol;

public class WS {

	public static void main(String[] args) {
		
		
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		
		System.out.println("Start...");
	
		
		
		for (int i = 1; i <= 100; i++) {
			if(i%3 == 0) {
			sum += i;
			cnt++;
		
     		}
			
		}
		avg = sum / (cnt * 1.0);//실수형태로 바꿈 
		System.out.printf("%d, %f", sum, avg);
		System.out.println("End..." + cnt);
		
		int sum2 = 0;
		double avg2 = 0.0;
		int cnt2 = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%4 == 0) {
			sum2 += i;
			cnt2++;
		
     		}
			
		}
		avg2 = sum2 / (cnt2 * 1.0);//실수형태로 바꿈 
		System.out.printf("%d, %f", sum2, avg2);
		System.out.println("End..." + cnt2);
		
		int sum3 = 0;
		double avg3 = 0.0;
		int cnt3 = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%7 == 0) {
			sum3 += i;
			cnt3++;
		
     		}
			
		}
		avg3 = sum3 / (cnt3 * 1.0);//실수형태로 바꿈 
		System.out.printf("%d, %f", sum3, avg3);
		System.out.println("End..." + cnt3);
	

	}
}


