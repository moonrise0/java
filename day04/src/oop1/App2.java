package oop1;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//앞에 car가 클래스 , car1 이라는 레퍼런스 변수
		Car car1 = new Car();
//		Car car1 = new Car("k2","blue",2000);//   new에의해서 생성자생성.
		car1.go();
		car1.stop();
		System.out.println("-------------------");
		Car car2 = new Car("k3","white",3000);//   new에의해서 생성자생성.
//		Car car2 = new Car()
		car2.go();
		car2.stop();
		
		
	}

}
