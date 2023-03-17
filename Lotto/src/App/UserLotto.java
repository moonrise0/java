package App;

import java.util.*;

public class UserLotto {

	int[] userLotto = new int[3];

	public static void main(String[] args) {
		new UserLotto().execute();
	}

	public void execute() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			try {
				System.out.print("Lotto " + (i + 1) + "번째 > ");
				String userStr = scan.next();
				int user = Integer.parseInt(userStr);
				if (user < 1 || user > 25) {
					throw new Exception();

				}
        			for (int j = 0; j < i; j++) {
                        if (userLotto[j] == user) {
                          i--;
                     throw new Exception("중복된 숫자가 있습니다.");
					}
				}
                		userLotto[i] = user;
			         } catch (Exception e) {i--;
                           String msg = e.getMessage();

				if (msg == null || e instanceof NumberFormatException)
					System.out.println("1~25 숫자만 넣어라!");
				else
                        System.out.println(msg);
			} finally {
				for (int j = 0; j < i + 1; j++)
					System.out.printf("%2d  ", userLotto[j]);
				System.out.println();
			}}}}