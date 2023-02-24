package ifcontrol;

import java.util.Scanner;

public class P92 {

	public static void main(String[] args) {
	     //숫자를 4개의 두자리수를 입력받는다.
		 //만약 두자리수가 아니면 프로그램 종료.
		  int sum = 0;
		 double avg = 0;
		 String grade = "";
		 
		Scanner sc = new Scanner(System.in);
		int ko = 0;
		int en = 0;
		int ma = 0;
		int si = 0;
		
		
		
		System.out.println("국어성적 입력:");
	    ko = Integer.parseInt(sc.next());
		if( 10 >= ko || ko >= 100) {
			sc.close();
			return;
		}
	    
		System.out.println("영어성적 입력:");
		 en = Integer.parseInt(sc.next());
		 if( 10 >= en || en >= 100) {
				sc.close();
				return;
			}
		System.out.println("수학성적 입력:");
		 ma = Integer.parseInt(sc.next());
		 if( 10 >= ma || ma >= 100) {
				sc.close();
				return;
			}
		System.out.println("과학성적 입력:");
		 si = Integer.parseInt(sc.next());
		 if( 10 >= si || si >= 100) {
				sc.close();
				return;
			}
		// 평균과 합계를 구합니다.
		
	  
		sum = ko + en + ma + si;
		avg =  sum / 4.0;
		 System.out.println(avg);
		 
		

      
		//평균 90이상 A, 평균 80이상 B,  평균  70이상 C, 60이상 D, 60미만이면 F
		 grade = (avg >= 90 ) ?"A" : (avg >= 80 ) ? "B" : (avg >= 70 ) ? "C" : (avg >= 60 ) ? "D" : "F" ;
		//합계, 평균 , 학점을 출력하시오
		
				 System.out.printf("%d, %f,%s", sum, avg ,grade);
				 
				 sc.close();
	}
	
 }