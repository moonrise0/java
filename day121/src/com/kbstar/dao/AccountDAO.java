package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;

public class AccountDAO implements DAO<String, AccountDTO>{

	HashMap<String, AccountDTO> db;
	
	public AccountDAO() {
		
		db = new HashMap<String, AccountDTO>();
	}
	
	@Override
	public void insert(AccountDTO v) throws Exception {
		if(db.containsKey(v.getAccNo())) {
			throw new Exception("DB Error");
		}
		db.put(v.getAccNo(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("DB Error");
		}
		db.remove(k);
	}

	@Override
	public void update(AccountDTO v) throws Exception {
		if(!db.containsKey(v.getAccNo())) {
			throw new Exception("DB Error");
		}
		db.put(v.getAccNo(), v);		
	}

	@Override
	public AccountDTO select(String k) throws Exception {
		AccountDTO obj = null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<AccountDTO> select() throws Exception {
		List<AccountDTO> list = new ArrayList<AccountDTO>();
		Collection<AccountDTO> col =  db.values();
		for(AccountDTO obj: col) {
			list.add(obj);
		}
		return list;
	}

	// 사용자의 계좌 조회
	// obj : 사용자의 id;
	// Object obj = new String();
	@Override
	public List<AccountDTO> search(Object obj) throws Exception { //obj 찾아서 list에 넣어서 표시한다.
		List<AccountDTO> list = new ArrayList<AccountDTO>();//생성된 애를 받을때는 null로
		Collection<AccountDTO> col = db.values();
		
		for(AccountDTO acc:col) { //다꺼내서
			
			if((acc.getHolder()).equals(obj)){ //string 비교
			list.add(acc); //계좌중에서 id개 obj와 같은 것들만 array리스트에 담아 리턴
			}
		}
		
		
		// TODO Auto-generated method stub
		return list;// null 로 되있는애를 리스트로 바꿔줘
	}

}
