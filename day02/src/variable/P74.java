package variable;

import java.util.Random;
import java.util.Scanner;

public class P74 {
    
	public static void main(String[] args) {

	  int a = 10;
	  int b = 10;
//	  a++;
//	  ++b;
	  System.out.printf("%d,%d\n",a,b);
	  
	  int result = ++a + b++; //b는 
	  System.out.printf("%d,%d\n",a,b);
	  System.out.println(result);
		
	  int aa = 10;
	  int bb = 10;
	  
	  System.out.println( (aa++ >=0) || (bb++ >= 0)) ; //뒤에는 볼필요도 없어서 연산을 안함;
	  System.out.println( (aa++ >=0) | (bb++ >= 0)) ;
	  System.out.printf("%d,%d\n",aa,bb);
	  
	}

}
