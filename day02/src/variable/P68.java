package variable;

import java.util.Random;

public class P68 {

	public static void main(String[] args) {
	     String s2 = "11"
//	     String s1 = 10; //안됨
	     String s1 = "10";
	     int s2 = Integer.parseInt(s1);
	     int a = 10;
         System.out.println(s2+a);
      
         Random r = new Random();
         int randomNumber = r.nextInt(45)+1;
         System.out.println(randomNumber);
         
	}

}
