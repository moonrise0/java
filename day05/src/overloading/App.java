package overloading;

import access.Employee;

public class App {

	public static void main(String[] args) {
	
		
		calculator c = new calculator();
		System.out.println(c.sum(10, 20));
		System.out.println(c.sum(10, 20, 30));
		System.out.println(c.sum(10, 20, 30 , 40));

		
		Employee e = new Employee();
		
	}

}
