package ws0309;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
	

	    private HashSet<Integer> winningNum = new HashSet<Integer>();
	    private double prizeMoney;

	    public void makeWinningNumberMoney() {
	        // 당첨 번호 생성
	        Random rand = new Random();
	        while (winningNum.size() < 3) {
	            int num = rand.nextInt(25) + 1;
	            winningNum.add(num);
	        }
	        // 당첨 금액 생성
	        prizeMoney = rand.nextDouble() * 2000000000;
	    }

	    public int checkRanking(ArrayList<Integer> myNum) {
	        // 본인이 입력한 숫자와 당첨 번호 비교
	        int cnt = 0;
	        for (int num : myNum) {
	            if (winningNum.contains(num)) {
	                cnt++;
	            }
	        }
	        // 등수 리턴
	        if (cnt == 3) {
	            return 1;
	        } else if (cnt == 2) {
	            return 2;
	        } else if (cnt == 1) {
	            return 3;
	        } else {
	            return 0;
	        }
	    }

	    public double prizeMoney(int grade) {
	        // 등수에 따른 당첨 금액 비율 설정
	        if (grade == 1) {
	            return prizeMoney * 0.7;
	        } else if (grade == 2) {
	            return prizeMoney * 0.2;
	        } else if (grade == 3) {
	            return prizeMoney * 0.1;
	        } else {
	            return 0;
	        }
	    }

	    public static void main(String[] args) {
	        Lotto game = new Lotto();
	        game.makeWinningNumberMoney();

	        // 본인이 입력한 숫자
	        ArrayList<Integer> myNum = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

	        // 등수와 당첨 금액 출력
	        int grade = game.checkRanking(myNum);
	        double prize = game.prizeMoney(grade);
	        System.out.println("당첨 번호: " + game.winningNum);
	        System.out.println("내 번호: " + myNum);
	        System.out.println("등수: " + grade);
	        System.out.println("당첨 금액: " + prize);
	    }
	}
