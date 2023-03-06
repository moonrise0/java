package calculator;



public class Ui {

	public static void main(String[] args) {
		   calculator cal = new calculator();
		   int result = 0;
		   result = cal.sum(10, 20); //받을준비
		   System.out.println(result); //ui에서 결과표현
		   cal.save(result);
		   System.out.println("OK");
	}

}
