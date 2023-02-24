package ifcontrol;

public class P85 {

	public static void main(String[] args) {
	  String grade = ""; //초기화 grade 모르니깐
	  String gender = "M" ;
	  double sum = 80.0;
	  
	  
		System.out.println("Start....");
		
//		if(grade.equals( "VIP")) {
//			System.out.println("사용불가");
////			return;     //break continue는 반복문에서 끊을때, 여기에선 return로 행위를 끝내라를 표현.
//	    }
		
		if(gender.equals("M")){
			System.out.println("Male....");
			
		}else {
			System.out.println("Female....");
		}
	
		if(sum >= 90.0) {
			grade = "VIP";
		}else if(sum >= 70.0) {
			grade = "GOLD";
		}else {
			grade = "SILVER";
		}
		
		if(grade.equals( "VIP")) {
		System.out.println("VIP 혜택...");
////			return;     //break continue는 반복문에서 끊을때, 여기에선 return로 행위를 끝내라를 표현.
         }
		
		
		System.out.printf("%s, %s, %4.2f \n", grade, gender, sum); //string string 실수
		
		System.out.println("End....");
    
	}
	
    }