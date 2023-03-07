package cal;

import java.util.Scanner;

public class CalUI {   //안에서 고장났는지 안고장났는지 외부에서 는 모르니깐 이 처리 해주는 것. 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Input 2 Number");

		double a =  Double.parseDouble(sc.next());
		double b =  Double.parseDouble(sc.next());
		double result = 0.0;
//		try {
			try {
				result = Cal.div(a,b);
				System.out.println(result);
			} catch (InfitinyException e) {
				System.out.println(e.getMessage());
			
				
			}
//		} catch (Exception e) {
//			System.out.println("분모가 없다");
//		}
         System.out.println(result);
         sc.close();
		
		
				sc.close();
	}

}
