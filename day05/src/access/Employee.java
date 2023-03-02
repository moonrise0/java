package access;

public class Employee {
	private String id;
	protected String name; // 소스에서 컨스터럭터 유징 필드.
	 int salary;   //프라이빗해서 값을 가져오기가 힘듬.

	public Employee() { // 디폴트값 설정.
	}

	public Employee(String id, String name, int salary) {
		this.id = id; //입력된 값을 객체에 넣어주고싶다.
		this.name = name;
		this.salary = salary;    //필드들을 초기화시켜주는 역할.
	}

	//프라이빗해서 정보를 게터 앤 세터로 송부하고함.
	
	
	 public double getTax( ) {
		 double result = 0;
		 result = this.salary * 0.17 ;
		 return result;
	 }
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	private int getAnnSalary() {
		 int result = 0; //지역변수.초기화를 매번 시켜주기.
		 result = this.salary * 12;
		 return result;
	 }
     protected double getAnnTax() {
    	 double result = 0.0;
    	 result =  this.getAnnSalary() * 0.17; // (this.salary * 12 )
    	 return result;
     }

	@Override
	public String toString() { //잘쓰지는 않음.
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

    
}


