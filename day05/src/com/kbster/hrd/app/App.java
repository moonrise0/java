package com.kbster.hrd.app;

import com.kbstar.hrd.Employee;

public class App {

	public static void main(String[] args) {
	
		
		Employee e = new Employee("100", "이막술", 500);
		System.out.println(e.toString()); //tostring을 없애도되긴함.
	//컨트롤스페이스해바
	   
	   System.out.println(e.getSalary());
       System.out.println(e.getTax());
       System.out.println(e.getAnnSalary());
       System.out.println(e.getTax());
       
       System.out.println("---------");
       
       Employee emps[] = new Employee[3];
       emps[0] = new Employee("201", "호라마",400);
       emps[1] = new Employee("202", "호라마",450);
       emps[2] = new Employee("203", "호라마",480);
       
       
      for(Employee em:emps) {
    	  System.out.println(em);
    	  System.out.println(em.getTax());
    	  System.out.println(em.getAnnSalary());
    	  System.out.println(em.getAnnTax());
      }
  }
}
