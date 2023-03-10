package com.kbstar.service;

import java.util.List;


import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.dao.TransactionDAO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class TransactionService implements CRUDService<String, TransactionDTO>{
	
	
	DAO<String, TransactionDTO> transDao;

	
	public TransactionService() {
		transDao= new TransactionDAO();
	
	}
	

	@Override
	public void register(TransactionDTO v) throws Exception {
		
		try {
			transDao.insert(v);
		}catch (Exception e) {
			throw new Exception("계좌 개설이 실패하였습니다.");
		}
	}

	@Override
	public void remove(String k) throws Exception {
		TransactionDTO acc = null;
		acc = transDao.select(k);
		try {
			transDao.delete(k);
		}catch(Exception e) {
			throw new Exception("개설 해지오류입니다");
		}
	}

	@Override
	public void modify(TransactionDTO v) throws Exception {
	  
	   try {
		   transDao.update(v );
	   }catch(Exception e) {
		   throw new Exception("수정오류입니다.");
	   }
	}

	@Override
	public TransactionDTO get(String k) throws Exception {
		TransactionDTO obj = null;
		obj = transDao.select(k);
		return obj;
		
	}

	@Override
	public List<TransactionDTO> get() throws Exception {
		
		List<TransactionDTO>list = null;
		try {
		list = transDao.select(); 
		}catch(Exception e) {
			throw new Exception ("오류");
		}
		return list;
	}

}
