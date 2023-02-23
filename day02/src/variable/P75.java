package variable;

import java.util.Random;
import java.util.Scanner;

public class P75 {
    
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 (10~100)");
        String cmd = sc.next();
        
        Random r = new Random();
        int num = Integer.parseInt(cmd);
        int randomNumber = r.nextInt(num)+1;
        System.out.println(randomNumber);
        //10~100 사이의 정수를 입력받는다.
		//1부터 입력받은 숫자 끼리의 범위에서 랜덤한 숫자를 발생하시오
		sc.close(); //닫아줘야함
		
	}

}
