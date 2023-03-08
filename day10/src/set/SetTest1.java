package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		  Set<Integer> set = new HashSet<Integer>();
		  //1~10까지 숫자를 10개 입력하세요
		  
		  set.add(10);
		  set.add(10);
		  set.add(20);
		  set.add(10);
		  Random r = new Random();
		  
		  
		  
	 while(set.size()<10) {
		 int num = r.nextInt(10) + 1;
		 set.add(num);
	 }
		  
		  
		  
	 for(int i=0; i<10; i++) {
		 int num =r.nextInt(10) + 1;
		 set.add(num);
	 }
		 
	 
		  
     for(int data: set) {
    	 System.out.println(set.size());	 
    	 System.out.println(data);
     }
	}

}
