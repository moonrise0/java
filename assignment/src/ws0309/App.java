package ws0309;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		        Lotto game = new Lotto();
		        game.makeWinningNumberMoney();

		        // 테스트를 위한 입력 코드
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("1~25 사이의 숫자 3개를 입력하세요.");
		        ArrayList<Integer> myNum = new ArrayList<Integer>();
		        for (int i = 0; i < 3; i++) {
		            int num = scanner.nextInt();
		            myNum.add(num);
		        }

		        int grade = game.checkRanking(myNum);
		        game.prizeMoney(grade);
		    }
		

	}


