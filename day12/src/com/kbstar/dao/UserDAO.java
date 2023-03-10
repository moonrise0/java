package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

//import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO> {

	HashMap<String, UserDTO> db; // 데이타베이스 사용하기위해서

	public UserDAO() {
		db = new HashMap<>();
	}

	@Override
	public void insert(UserDTO v) throws Exception {
		if (db.containsKey(v.getId())) {
			throw new Exception("DBerror");
		}
		db.put(v.getId(), v);

	}

	@Override
	public void delete(String k) throws Exception {
		if (!db.containsValue(k)) {   //contains key or value.
			throw new Exception("");
		}
		db.remove(k);
	}

	@Override
	public void update(UserDTO v) throws Exception {

		if (!db.containsKey(v.getId())) {
			throw new Exception("");
		}
		db.put(v.getId(), v);

	}

	@Override
	public UserDTO select(String k) throws Exception {
		UserDTO obj = null; // obj로 놓으면 유지보수 크다. 객체 만들어서 따로따로 가져와야하는 것을 obj로 만들고 가져오면 편함.
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<UserDTO> select() throws Exception {
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		Collection<UserDTO> col = db.values();

		for (UserDTO obj : col) {
			list.add(obj);
		}

		return list;

	}

}
