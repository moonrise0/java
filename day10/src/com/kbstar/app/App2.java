package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ItemDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;
import com.kbstar.service.UserService;

public class App2 {

	public static void main(String[] args) {
		Service<Integer, ItemDTO> service = new ItemService();
		SearchService search = new ItemService();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("input command(q,i,d,u,s)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("bye");
				break;
			} else if (cmd.equals("s")) {
				search.search();

			} else if (cmd.equals("i")) {
				System.out.println("input ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("input PWD..");
				String name = sc.next();
				System.out.println("input Price..");
				double price = Double.parseDouble(sc.next());
				System.out.println("input qt...");
				int qt = Integer.parseInt(sc.next());

				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					service.register(item);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else if (cmd.equals("d")) {
				System.out.println("input ID...");
				try {
					int id = Integer.parseInt(sc.next());
					service.remove(id);
				} catch (Exception e) {
					System.out.println("잘못 입력 하셨습니다");
				}

			} else if (cmd.equals("u")) {
				System.out.println("input ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("input PWD..");
				String name = sc.next();
				System.out.println("input Price..");
				double price = Double.parseDouble(sc.next());
				System.out.println("input qt...");
				int qt = Integer.parseInt(sc.next());

				ItemDTO user = new ItemDTO(id, name, price, qt);
				try {
					service.modify(user);
				} catch (Exception e) {

					e.printStackTrace();
				}
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