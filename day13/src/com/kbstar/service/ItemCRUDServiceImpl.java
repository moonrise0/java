package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.ItemDaoImpl;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeItemNumber;

public class ItemCRUDServiceImpl implements CRUDService<String,Item>{
   
	 DAO<String, String,Item> dao;
	 
	 public ItemCRUDServiceImpl() {
		 dao = new ItemDaoImpl();
	 }
	 
	
	@Override
	public void register(Item v) throws Exception {
		try {
			String id = MakeItemNumber.makeItemNum();
			v.setId(id);
			dao.insert(v);
		} catch (Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("ID가 중복되었습니다.");
			} else {
				throw new Exception("시스템장애입니다.");
			}
		}

	}
		
	

	@Override
	public void modify(Item v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Item get(String k) throws Exception {
		Item item = null;
		try {
		item = dao.select(k);
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다.");
			}else {
				throw new Exception("ID가 존재 하지 않습니다");
			}
		}
		return item;
	
	}

	@Override
	public List<Item> get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
   
}
