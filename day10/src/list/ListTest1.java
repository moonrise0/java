package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
       List<Integer> list = new ArrayList<Integer>(); //<>은 제네릭 개념임
       
  
    		   
    		   Random r = new Random();
    			
    			 for(int i=1; i<=10 ; i++) {
    			   int num = r.nextInt(10)+1;
    			    list.add(num);		   
    			 }
    			 //이것도 0번째가 처음이다
               list.add(5,100);
               list.remove(5);
       for (int data: list) {
      	   System.out.println(data);
         } 
     
       }
}

//1부터 10까지의 숫자를 랜덤하게 담으세요.
//list.add(10);  
//list.add(20); 
//list.add(30); 