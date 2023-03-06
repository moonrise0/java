package inherit;

public class App2 {

	public static void main(String[] args) {
         //Manager is a 관계 Employee 성립.
		Employee e = new Manager("100","james", 500, 50);//자동타입변환(promotion)
		
		//		Manager m = new Employee("100", "james",550); 이 구문성립안됨

	    Employee ea[]= new Employee[5];
	    ea[0] = new Employee("100", "james",500);
	    ea[1] = new Employee("101", "james",500);
	    ea[2] = new Manager("102", "james",500 , 50);
	    ea[3] = new Manager("103", "james",500, 50);
	    ea[4] = new Sales("104", "james",500, "Seoul",0.35);
	    
	    for(Employee em:ea) {
	    	System.out.println(em); //상속으로 인해 다형성이 보여진다
	    	System.out.println(em.getAnnSalary());
	    	if (em instanceof Sales) {
	    		Sales s = (Sales)em; //파일캐스팅
	    		System.out.println(s.getIncentive());//하위함수의 specific한 get incentive는
	    		//파일캐스팅으로 타입변환을 해줘서 . sales만의 함수.
	    	}
	    	
	    	//get 인센티브함수가 안보이는 이유는 employee에 sales라는 객체를 넣었기 떄문에, employee에 정의된 함수만 보임.
	    }
	}

}




