package inherit2;

public class TaxCal {
	
	
	//Employee e = new Manager();
	
	public double getTax(Employee e){
        		double result = 0.0;
        		result = e.getAnnSalary()*0.17;
        		
        		return result; //값만 도출해서 APP에 리턴해줌
	}
}