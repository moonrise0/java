package array;

import java.util.Arrays;
import java.util.Random;

public class P104 {

	public static void main(String[] args) {
		     
	
		
		int arr[] = new int[10];
		Random r = new Random();
		
		 for(int i=0; i< arr.length ; i++) {
		   int data = r.nextInt(99)+1;
		    arr[i] = data;
//		 위 두줄을 하나로 정리하면,  arr[i] = r.nextInt(99)+1;
		 }		       
		 System.out.println(Arrays.toString(arr));//배열을 좋게 표현 
		 int sum = 0;
//		 int avg = 0 ;
          for(int a:arr) {      
        	 sum += a;
        			
             System.out.printf("%d \t", a );
	  }
          double avg = sum/arr.length;
//          
//          double avg =0.0;
//          avg = sum /(arr.length*1.0);
          
           System.out.println(sum);
     
         System.out.println (avg);

	}
}


//배열의 합과 평균을 구하시오.
