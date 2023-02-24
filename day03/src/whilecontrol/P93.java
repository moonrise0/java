package whilecontrol;

public class P93 {

	public static void main(String[] args) {
		System.out.println("Start...");
        int i = 0 ;
		while(i< 10){
//			i++;
                 System.out.println(i);
            i++; //위치차이 파악하기. 증감에 따라서 결과값이 달라질수 있다.
		}
		System.out.println("End..." +i );

	}

}


//앞에 클래스에서의 i랑 차이는 p92.java는 for문에 i가 갇혀있고, 이번 클래스의 int는 end뒤에도쓸수있는 다양하게 적용된다.