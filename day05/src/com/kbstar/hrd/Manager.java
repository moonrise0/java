package com.kbstar.hrd;

public class Manager {
	private String id;
	private String name;
	private double salary;
	private int bonus;

	public Manager() {
	}

	public Manager(String id, String name, double salary, int bonus) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;

	}


	 public double getTax( ) {
		 double result = 0;
		 result = this.salary * 0.17 ;
		 return result;
	
	 }
		 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		double result = 0;
		result = (this.salary ) * 0.17;
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public double getAnnSalary() {
		 double result = 0; //지역변수.초기화를 매번 시켜주기.
		 result = this.salary * 12;
		 return result;
	 }
    public double getAnnTax() {
   	 double result = 0.0;
   	 result =  this.getAnnSalary() * 0.17; // (this.salary * 12 )
   	 return result;
    }
	
	
}
