package whilecontrol;

public class P95 {
	
	public static void main(String[] args) {
		double avg = 0.0;
		int sum = 0;
		
		
		System.out.println("Start...");
		int cnt = 0;

		int i = 1;
		while (i <= 100) {
			if(i%2 == 0) { 
				
			sum += i;
			cnt++;
	
			}
			if(i == 80) {
				break;
		   }
			i++; //일반적으로 지금 현재위치가 맞다.
//			if(i == 80) {
//				break; 값이달라짐.
		}
		avg = (sum * 1.0) / cnt;
		System.out.printf("%d, %f", sum, avg);
		System.out.println("End..." + i);

	}

	}
