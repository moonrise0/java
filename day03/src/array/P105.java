package array;

import java.util.Arrays;
import java.util.Random;

public class P105 {

	public static void main(String[] args) {
		     
	
		
		int arr[] = new int[5];
		Random r = new Random();
		
		 for(int i=0; i< arr.length ; i++) {
		  arr[i] = r.nextInt(9)+1;
		 }		       
		 System.out.println(Arrays.toString(arr));
		 
		  int sum = 0;
		  double avg = 0.0;
		  int cnt = 0;
		  
          for(int i=0; i< arr.length;i++) { //여기서 i는 몇번째
	     if(i%2 == 0) { // 0을 넣는 이유 array 0부터시작. 확인잘할껄
	    	 sum += arr[i];
	    	 cnt ++ ;
	     }
       
          }
       avg = sum / (cnt*1.0);
       System.out.printf("%d, %4.2f", sum, avg);
      }
	}

//	    if (i%2 == 0) -> sum += arr[i]; cnt ++ 홀수갯수를 세야하니깐cnt변수.
//	     continue; sum += arr[i];