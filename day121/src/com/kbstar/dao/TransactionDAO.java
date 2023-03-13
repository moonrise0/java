package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.DAO;

public class TransactionDAO implements DAO<String, TransactionDTO>{

	HashMap<String, TransactionDTO> db;
	
	public TransactionDAO() {
		
		db = new HashMap<String, TransactionDTO>();
	}
	
	@Override
	public void insert(TransactionDTO v) throws Exception {
		if(db.containsKey(v.getDate())) {
			throw new Exception("DB Error");
		}
		db.put(v.getDate(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		
	}

	@Override
	public void update(TransactionDTO v) throws Exception {
			
	}

	@Override
	public TransactionDTO select(String k) throws Exception {
		TransactionDTO obj = null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<TransactionDTO> select() throws Exception {
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		Collection<TransactionDTO> col =  db.values();
		for(TransactionDTO obj: col) {
			list.add(obj);
		}
		return list;
	}
	// 고객이 보유 하고 있는 계좌번호를 입력 하면
	// 해당 계좌의 거래 내역을 조회 한다.
	@Override
	public List<TransactionDTO> search(Object obj) throws Exception { //트랜잭선 dto타입 
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();//생성된 애를 받을때는 null로
		Collection<TransactionDTO> col = db.values();
		
		for(TransactionDTO tr:col) { //다꺼내서
			
			if((tr.getAccNo()).equals(obj)){ //string 비교
			list.add(tr); //계좌중에서 id개 obj와 같은 것들만 array리스트에 담아 리턴
			}
		}
		
		
		// TODO Auto-generated method stub
		return list;
		
	}

}
