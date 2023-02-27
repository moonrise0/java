package array;

import java.util.Arrays;
import java.util.Random;

public class P106 {

	public static void main(String[] args) {
		     
	
		
		int arr[] = new int[10];
		Random r = new Random();
		
		 for(int i=0; i< arr.length ; i++) {
		  
           arr[i] = r.nextInt(99)+1;
		 }		       
		 System.out.println(Arrays.toString(arr));//배열을 좋게 표현 
		 
		 int sum = 0;
		 double avg = 0.0;
		 int cnt = 0;
		  
         for(int i=0; i< arr.length;i++) { 
	     if(arr[i] %2 == 1) { 
	    	 sum += arr[i];
	    	 cnt ++ ;
	     }
//          for(int a:arr) {
//        	  if(a%2 !=0) {
//        		  sum += a;
//        		  cnt ++;
//        	  }
//          }
	     
	     
         }
       avg = sum / (cnt*1.0);
      System.out.printf("%d, %4.2f", sum, avg);
	}
}
//배열의 값을 꺼내오는 방법.