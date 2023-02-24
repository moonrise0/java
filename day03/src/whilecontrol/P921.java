package whilecontrol;

public class P921 {
	// 합과 평균을 구하시오
	public static void main(String[] args) {
		System.out.println("Start...");
		int sum = 0;
		double avg = 0.0;

		int cnt = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			cnt++;

		}
		avg = sum / (cnt * 1.0);//실수형태로 바꿈 
		System.out.printf("%d, %f", sum, avg);
		System.out.println("End..." + cnt);

	}

}
