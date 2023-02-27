package ifcontrol;

public class P84 {

	public static void main(String[] args) {
	  String grade = ""; //초기화 grade 모르니깐
	  String gender = "M" ;
	  double sum = 40.0;
	  
	  
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
		   

		 if (gender.equals ("M")) {
			 if(sum >= 90) {
				 grade = "MVIP";
			 }else if(sum >= 80) {
		      grade =  "MGOLD" ;
		  }     else {
		     grade = "MNORMAL"; 
		  }
		
		 }else {
      
		  if(sum >= 90) {
			 grade = "FVIP";
		 } else if(sum >= 80) {
		  grade =  "FGOLD" ;
	      
	      } else {
		 grade = "FNORMAL";
	     }
       }	
       
	    
		switch(grade) {
		case "FVIP":
		case "MVIP":
			sum += 100;//break안하면 90도 주고 10도받음 vip가
			break;
		case "MGOLD":
		case "FGOLD":
			sum += 90;
			break;
		
		default :
			sum += 10;
		}
//		
		if(grade.equals( "VIP")) {
		System.out.println("VIP 혜택...");
////			return;     //break continue는 반복문에서 끊을때, 여기에선 return로 행위를 끝내라를 표현.
         }
		
		
		System.out.printf("%s, %s, %4.2f \n", grade, gender, sum); //string string 실수
		
		System.out.println("End....");    
	}
	
    }
