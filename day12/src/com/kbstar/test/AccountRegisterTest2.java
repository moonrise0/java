package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.MakeAccountNumber123;
import com.kbstar.service.AccountService;
import com.kbstar.service.UserService;

public class AccountRegisterTest2 {
	public static void main(String[] args) {
		CRUDService<String, AccountDTO> service = new AccountService();
		AccountDTO obj = 
				new AccountDTO(MakeAccountNumber123.MakeAccNum(), 10000, "id01");			
		
		AccountDTO obj2 = 
				new AccountDTO(MakeAccountNumber123.MakeAccNum(), 20000, "id01");			
		
		AccountDTO obj3 = 
				new AccountDTO(MakeAccountNumber123.MakeAccNum(), 30000, "id02");		

		try {
			service.register(obj);
			service.register(obj2);
			service.register(obj3);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

		AccountDTO account = null;
		try {
			account = service.get("id01");
			System.out.println(account);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Emp e = new Manager();
		// List list = new ArrayList();

		List<AccountDTO> list = null;

		try {
			list = service.get();
			for (AccountDTO u : list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// remove test
		try {
			service.remove("id04");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
