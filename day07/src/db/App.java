package db;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	     DAO dao = new MariaDBDAO();    //	 new OracleDAO(); //
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("input command(q,i,d,u)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("bye");
				break;
			}else if(cmd.equals("i")) {
				System.out.println("input ID...");
				String id = sc.next();
				System.out.println("input PWD..");
				String pwd = sc.next();
				System.out.println("input NAME..");
				String name = sc.next();
				UserDTO user = new UserDTO(cmd, pwd, name);
				dao.insert(user);
			}else if(cmd.equals("d")) {	
				System.out.println("input ID...");
				String id = sc.next();
				dao.delete(id);
				
			
			}else if(cmd.equals("u")) {	
				System.out.println("input ID...");
				String id = sc.next();
				System.out.println("input PWD..");
				String pwd = sc.next();
				System.out.println("input NAME..");
				String name = sc.next();
				UserDTO user = new UserDTO(cmd, pwd, name);
				dao.update(user);
							}
		}

		
		
		sc.close();
	}

}
