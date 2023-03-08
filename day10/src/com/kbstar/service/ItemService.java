package com.kbstar.service;

import java.nio.file.FileSystemLoopException;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;

public class ItemService implements Service<Integer, ItemDTO>, SearchService { // CLASS 만들때 ADD해서  상속가져옴.

	DAO<Integer, ItemDTO> dao;           
	
	public ItemService() {
		dao = new ItemDAO(); //프로모션 관계 -> 다형성 , 만약 db를 바꾼다고 하면  new OracleDAO로 바꿔주면됨.
	}
	
	@Override
	public void register(ItemDTO v) throws Exception {
	 System.out.println(v + "Data Check...");   
	 try {
		dao.insert(v);
	} catch (Exception e) {

	     throw e;
	}
	 System.out.println(v + "Send SMS");
	
	}

	@Override
	public void remove(Integer k) throws Exception {
		 System.out.println(k + "Data Check...");   
		 try {
			dao.delete(k);
		} catch (Exception e) {
		
			 throw e;
		}
		 System.out.println(k + "Send SMS");
		
		
	}

	@Override
	public void modify(ItemDTO v) throws Exception{
		 System.out.println(v + "Data Check...");   
		 try {
			dao.update(v);
		} catch (Exception e) {
			
			throw e;
		}
		 System.out.println(v + "Send SMS");
		
	}

	@Override
	public void search() {
	 System.out.println("ITEM SEARCH");
		
	}

	
	
	
	
	
	
	
	
	
//	public void search() {
//		System.out.println("Search..");
//		
//		
//	}

}
