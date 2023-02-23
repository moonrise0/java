package variable;

public class p64 {

	public static void main(String[] args) {
		int a = 10;
                int b = 12;
		double d = 10.2345;
		String str1 = "abc";
		String str2 = "abc";
		str1 = "def";
		System.out.printf("%d %4.2f %s \n",a,d,str1);  // \t는 간격주는거 \n 은 간격주는것
		
		if(str1 == str2) {     //주소값비교 번지를 비교하는거고 stack 상의
			System.out.println("OK"); 
		}
		if(str1.equals(str2)) {   //값을 비교하는 거고
			System.out.println("OK2");
		}	
			String str3 = new String("abc");    //string은 new라는 개념으로 만들수 있다. 대신 heap영역에서 새로운 칸을만듦
			String str4 = new String("abc");
		
		
//			if(str1 == str)) {   //안된다
				System.out.println("OK3");		
			}
	}

			
		

		

	


