package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class AccountService implements CRUDService<String, AccountDTO>{
	
	
	DAO<String, AccountDTO> accDao;

	
	public AccountService() {
		accDao= new AccountDAO();
	
	}
	

	@Override
	public void register(AccountDTO v) throws Exception {
		
		try {
		    accDao.insert(v);
		}catch (Exception e) {
			throw new Exception("계좌 개설이 실패하였습니다.");
		}
	}

	@Override
	public void remove(String k) throws Exception {
		AccountDTO acc = null;
		acc = accDao.select(k);
		try {
			accDao.delete(k);
			
		     
		}catch(Exception e) {
			throw new Exception("개설 해지오류입니다");
		}
	}

	@Override
	public void modify(AccountDTO v) throws Exception {
	  
	   try {
		   accDao.update(v );
	   }catch(Exception e) {
		   throw new Exception("수정오류입니다.");
	   }
	}

	@Override
	public AccountDTO get(String k) throws Exception {
		AccountDTO obj = null;
		obj = accDao.select(k);
		return obj;
		
	}

	@Override
	public List<AccountDTO> get() throws Exception {
		
		List<AccountDTO>list = null;
		try {
		list = accDao.select(); 
		}catch(Exception e) {
			throw new Exception ("오류");
		}
		return list;
	}

}
