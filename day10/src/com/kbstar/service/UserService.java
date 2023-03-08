package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class UserService implements Service<String,UserDTO>{

	DAO<String, UserDTO> dao;
	
	public UserService() {
		dao = new UserDAO();    //선언해줘야함
	}
	
	
	@Override
	public void register(UserDTO v) throws Exception { //throws를 통해 어플로 날아감.
		System.out.println("Security Check..");
		
		
		try {
		dao.insert(v);
		} catch (Exception e) {
			throw e;
		}
		
		
		System.out.println("Send mail..");
		System.out.println("Send SMS..");
	}


	@Override
	public void remove(String k) {
		try {
			dao.delete(k);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("Send SMS..");
		
		
	}


	@Override
	public void modify(UserDTO v) throws Exception {
     	try {
		
		dao.update(v);
     	} catch (Exception e) {
     		throw e; //Log //문제던짐
     	}
		System.out.println("Send SMS..");
		
	}


	
}

