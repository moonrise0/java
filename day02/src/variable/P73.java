package variable;

import java.util.Scanner;

public class P73 {
    
	public static void main(String[] args) {
		int a = 10;

		Scanner sc = new Scanner(System.in);
		System.out.println("명령을 입력하세요 (q,i,d,s)");

		String cmd = sc.next();
		System.out.printf("%s를 입력 했습니다.", cmd);
		sc.close(); //닫아줘야함
		
	}

}
