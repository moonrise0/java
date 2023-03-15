package ws0309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    private HashSet<Integer> winningNum;
    private double prizeMoney;

    public Lotto() {
        winningNum = new HashSet<Integer>();
        prizeMoney = 0;
    }

    // 당첨 번호와 당첨금을 생성
    public void makeWinningNumberMoney() {
        Random random = new Random();
        while (winningNum.size() < 3) {
            winningNum.add(random.nextInt(25) + 1);
        }
        prizeMoney = random.nextDouble() * 2000000000;
    }

    // 등수 정보를 입력 하면 당첨 금액을 리턴 후 화면에 표시
    public int prizeMoney(int grade) {
        int money = 0;
        switch (grade) {
            case 1:
                money = (int)(prizeMoney);
                break;
            case 2:
                money = (int)(prizeMoney * 0.2);
                break;
            case 3:
                money = (int)(prizeMoney * 0.4);
                break;
            default:
                money = 0;
        }
        System.out.println("당첨금액은 " + money + "원 입니다.");
        return money;
    }

    // 입력한 숫자 3개를 argument로 입력 하면 몇개가 일치한지를 check 한후 등수를 리턴
    public int checkRanking(ArrayList<Integer> myNum) {
        int count = 0;
        for (int num : myNum) {
            if (winningNum.contains(num)) {
                count++;
            }
        }
        int grade = 0;
        switch (count) {
            case 3:
                grade = 1;
                break;
            case 2:
                grade = 2;
                break;
            case 1:
                grade = 3;
                break;
            default:
                grade = 0;
        }
        return grade;}}
//    }

//    public static void main(String[] args) {
//        Lotto game = new Lotto();
//        game.makeWinningNumberMoney();
//
//        // 테스트를 위한 입력 코드
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("1~25 사이의 숫자 3개를 입력하세요.");
//        ArrayList<Integer> myNum = new ArrayList<Integer>();
//        for (int i = 0; i < 3; i++) {
//            int num = scanner.nextInt();
//            myNum.add(num);
//        }
//
//        int grade = game.checkRanking(myNum);
//        game.prizeMoney(grade);
//    }
//}