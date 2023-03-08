package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.UserService;

import bank.MakeMessage;


public class App {

	public static void main(String[] args) {
	    Service<String, UserDTO> service = new UserService();
	    
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
				try {
					service.register(user);
				} catch (Exception e) {
					System.out.println(MakeMessage.MakeMessage(e.getMessage()));
				}
			}else if(cmd.equals("d")) {	
				System.out.println("input ID...");
				String id = sc.next();
				try {
					service.remove(id);
				} catch (Exception e) {
				
					e.printStackTrace();
				}
				
			
			}else if(cmd.equals("u")) {	
				System.out.println("input ID...");
				String id = sc.next();
				System.out.println("input PWD..");
				String pwd = sc.next();
				System.out.println("input NAME..");
				String name = sc.next();
				UserDTO user = new UserDTO(cmd, pwd, name);
				try {
					service.modify(user);
				} catch (Exception e) {
					System.out.println(MakeMessage.MakeMessage(e.getMessage()));
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