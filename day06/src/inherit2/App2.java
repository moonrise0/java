package inherit2;

public class App2 {

	public static void main(String[] args) {
//Manager is a 관계 Employee
		Employee e = new Manager("100","james", 500,50);
//		Manager m = new Employee("100", "james",550); 이구문성립안됨

	    Employee ea[]= new Employee[5];
	    ea[0] = new Employee("100", "james",550);
	    ea[1] = new Employee("101", "james",550);
	    ea[2] = new Manager("102", "james",550 , 50);
	    ea[3] = new Manager("103", "james",550, 50);
	    ea[4] = new Sales("104", "james",500, "Seoul",0.35);
	    
	    for(Employee em:ea) {
	    	System.out.println(em); //상속으로 인해 다형성이 보여진다
	    	System.out.println(em.getAnnSalary());
	    	System.out.println(em.getIncentive());
//	    	if (em instanceof Sales) {
//	    		Sales s = (Sales)em; //파일캐스팅!
//	    		System.out.println(s.getIncentive());
	    	}
	    	System.out.println("-------------------------------");
	    	//get 인센티브함수가 안보이는 이유는 employee에 sales라는 객체를 넣었기 떄문에, employee에 정의된 함수만 보임.
	    
	        TaxCal t = new TaxCal();
	      double result = t.getTax(ea[3]); //결과는 double로 들어오고 우리는 뿌린다. employee로 정의했는데 [3],[4]도 가능해!
	       System.out.println(result)  ;
	
	}
	}


