package inherit;

public class App {
	//상속했기에
	public static void main(String[] args) {
	Employee e = new Employee("100", "james",500);
	System.out.println(e);
	System.out.println(e.getAnnSalary());
	
	Manager m = new Manager("200", "KIM", 500, 50);
	System.out.println(m);
	System.out.println(m.getAnnSalary()); 
	
	}

}
