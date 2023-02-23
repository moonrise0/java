package variable;

public class P54 {

	public static void main(String[] args) {
           boolean b1 = 10>5 ;
           //정수
           int n1 = 10;
           long n2 = 200000000L; //자바에서 정수는 기본형이 INT라서 L을 뒤에 붙여줘야 자료크기 벗어나지않음.
           
           //실수
           double d1 = 1.0;
           float f1= 1.0F; //기본값이 더블이므로 F를 붙여줌.
           
           double d2 = 1/2;
           System.out.println(d2);
           
           double d3 = 10.0/3.0;
           System.out.println(d3);
           
           float f2 = 10.0F/3.0F; //더블이면 더블 , 플로트면 플로트끼리
           System.out.println(f2);
           
           //CHAR 
           char c1 = 'A'; //큰따옴표면 안됨.
           System.out.println(c1);
           
           char c2 = 65; //
           System.out.println(c2);
           
           
           //이렇게 정수타입과 실수타입 논리타임이 기본타입(primitive type) 
           
           int n3 = 10;
           double n4 = 10.0;
           double result = n3 + n4; //인트로 받으면 리스크가 있으니 더블로 합해줘라
	}

}
