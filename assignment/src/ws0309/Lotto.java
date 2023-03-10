package ws0309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
    
    private HashSet<Integer> winningNum; // 당첨번호
    private double prizeMoney; // 당첨금액
    
    // 생성자
    public Lotto() {
        this.winningNum = new HashSet<Integer>();
        this.prizeMoney = 0.0;
    }
    
    // 당첨 번호와 당첨 금액을 생성하는 함수
    public void makeWinningNumberMoney() {
        Random random = new Random();
        while (winningNum.size() < 3) {
            int num = random.nextInt(25) + 1;
            winningNum.add(num);
        }
        prizeMoney = random.nextDouble() * 2000000000;
    }
    
    // 내가 선택한 숫자와 당첨 번호를 비교하여 등수를 반환하는 함수
    public int checkRanking(ArrayList<Integer> myNum) {
        int matchCount = 0;
        for (int num : myNum) {
            if (winningNum.contains(num)) {
                matchCount++;
            }
        }
     
        if (matchCount == 3) {
            return 1;
        } else if (matchCount == 2) {
            return 2;
        } else if (matchCount == 1) {
            return 3;
        } else {
            return -1; // 꽝
        }
    }
    
    // 등수 정보를 입력하면 당첨 금액을 반환하는 함수
    public double prizeMoney(int grade) {
        // 등수에 따른 당첨금 비율은 자유롭게 설정 가능
        switch (grade) {
            case 1:
                return prizeMoney * 0.7;
            case 2:
                return prizeMoney * 0.2;
            case 3:
                return prizeMoney * 0.1;
            default:
                return 0.0; // 꽝
        }
    }
    
}