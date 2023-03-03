package inherit;

public class Manager extends Employee{
     private double bonus;
 //컨스트럭터 상속안됨

	public Manager() {
		super();
	}

	public Manager(String id, String name, double salary) {
		super(id, name, salary); //상속받아서 상위것을 가져옴
	}

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double getAnnSalary() {
	   double result = 0.0;
//	   result = (this.getSalary + this.bonus) * 12; //코드상 접근이 안되는 경우.
	   result = super.getAnnSalary() + (this.bonus * 12);
	   return result;
	   
	}

	@Override
	public String toString() {
		return super.toString() + " " + bonus;
//		return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
	}
     
	//함수의 재정의(overriding)
     
}
