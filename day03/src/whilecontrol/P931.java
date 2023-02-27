package whilecontrol;

public class P931 {

	public static void main(String[] args) {
	
		int sum = 0;
		double avg = 0.0;
		
		System.out.println("Start...");
		int i = 1;
		while (i <= 100) {
			sum += i;
			
			 i++;
			
		}
		
		avg = (sum*1.0)/ (i-1);
		System.out.printf("%d, %f", sum, avg);
		System.out.println("End..." + i);
	
	
	}

}

//앞에 클래스에서의 i랑 차이는 p92.java는 for문에 i가 갇혀있고, 이번 클래스의 int는 end뒤에도쓸수있는 다양하게 적용된다.