package bank;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Account acc = null;

		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Input Command: (c, w, d, s, q)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Exit");
				break;

			
			} else if (cmd.equals("c")) {
				System.out.println("Create Account: ");
				System.out.println("Input AccNumber: ");
				String accNo = sc.next();
				System.out.println("Input Name: ");
				String accHolder = sc.next();
				System.out.println("Input AccHolder: ");
				String name = sc.next();
				System.out.println("Input Balance:");
				double balance = Double.parseDouble(sc.next());

				
				
				
				try {
					acc = new Account(accNo, name, accHolder, balance);
					System.out.println(acc);
				} catch (MinusException e) {
					System.out.println(e.getMessage());
				}
			} else if (cmd.equals("w")) {
				System.out.println("Withdraw: ");
				System.out.println("Withdrawl Amount: ");
				double money = Double.parseDouble(sc.next());
				try {
					acc.withdraw(money);
					System.out.println(acc);
				} catch (MinusException | BalanceException e) {
			
					System.out.println(e.getMessage());
				}

			
			} else if (cmd.equals("d")) {
				System.out.println("Deposit:");
				System.out.println("Deposit Amount: ");
				double money = Double.parseDouble(sc.next());
				try {
					acc.deposit(money);
					System.out.println(acc);
				} catch (MinusException e) {
					System.out.println(e.getMessage());
				}


			} else if (cmd.equals("s")) {
				System.out.println("Select:");
				System.out.println(acc);
			}
		}
		sc.close();
	}

}