package inherit2;

import java.util.Date;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e1 = new Employee();
       Employee e2 = new Manager();
       Employee e3 = new Sales();//컨트롤스페이스로 확인하기.
       
       Object obj1 = new Employee(); //employee is a object ? Employee extends Object가 항상 생략된거야
       Object obj2 = new Manager();
       Object obj3 = new Date();
	}

}
