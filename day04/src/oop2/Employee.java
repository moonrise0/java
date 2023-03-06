package oop2;

import java.util.Calendar;
import java.util.Random;

public class Employee {
	private String id;
	private String name;
	private int salary;

	public Employee() {
		this.id = "temp0001";
		this.name = "temp";
		this.salary = 10000000;

	}

	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		if (salary < 0) {

			this.salary = 0;
		} else {
			this.salary = salary;
		} // this 꼭 써줘야하는 케이스
	}

	public Employee(String name, int salary) {// 자동적으로 이름과 소득에 맞게 id가 만들어지는
//		this.id = Calendar.YEAR + "" + Calendar.MILLISECOND;
		this("10000",name,salary);//위에것을 가져오는 것
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() { //app에서 받으려면,
		return salary;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAnnSalary() {
		return this.salary * 12;

	}

	public double getTax() {
		return this.salary * 1.75;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", getTax=" + "]";
	}

}
