package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class App {

	public static void main(String[] args) {

//		DAO<String, UserDTO> userDao = null; //안된다.
		DAO<String, UserDTO> userDao = new UserDAO();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("input command(q,i,d,u,s,sa)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("bye");
				break;
			} else if (cmd.equals("i")) {
				System.out.println("input ID...");
				String id = sc.next();
				System.out.println("input PWD..");
				String pwd = sc.next();
				System.out.println("input NAME..");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				try {
					userDao.insert(user);
				} catch (Exception e) {
					System.out.println("id존재");
				}
			} else if (cmd.equals("d")) {
				System.out.println("input ID...");
				String id = sc.next();
				try {
					userDao.delete(id);
				} catch (Exception e) {
					System.out.println("id없고");
				}

			} else if (cmd.equals("u")) {
				System.out.println("input ID...");
				String id = sc.next();
				System.out.println("input PWD..");
				String pwd = sc.next();
				System.out.println("input NAME..");
				String name = sc.next();
				UserDTO user = new UserDTO(cmd, pwd, name);
				try {
					userDao.update(user);
				} catch (Exception e) {
					System.out.println("id없고");
				}
			} else if (cmd.equals("s")) {
				System.out.println("input ID...");
				String id = sc.next();
				UserDTO user = null; // 밖에다 써주는 것
				try {
					user = userDao.select(id); // 한명꺼만 줘라 앞에 user =은 안써도 됨
					System.out.println(user);
				} catch (Exception e) {
					System.out.println("id존재없고");
					// userDAO 에서 선택을 하면 userDTI 정보가 날라온다~
				}
			} else if (cmd.equals("sa")) { // 사용자 정보전체를를 list에 담아서 준다.
				List<UserDTO> list = null;// list 받을준비해 , 모두 주는 로직
				try {
					list = userDao.select();
					for (UserDTO u : list) { // list내역을 출력하려면 for문으로 주로
						System.out.println(u);
					}

				} catch (Exception e) {

				} // 모두 보내달라고 요청
			}
		}

		sc.close();
	}

}

//	public static void main(String[] args) {
//	    Service<String,UserDTO> service = new UserService(); //유저서비스 객체 만들어주고 -> 선언 DAO
//	    UserDTO user = new UserDTO("id01","pwd01","james");
//        service.register(user);
//	