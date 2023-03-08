package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer,ItemDTO>{ //DAO 에서 나온 함수를 재정의하는이유는? 나중에 교체되도 문제가없게하려고.

	@Override
	public void insert(ItemDTO v) throws Exception {
		if(v.getId()== 5) {
			throw new Exception("EX0006");
			
		}
		System.out.println(v.getId()+"저장됩니다");
		
		}
// int id = 100;
	@Override
	public void delete(Integer k) throws Exception{
		if(k == 5) {
			throw new Exception("EX0006");
		}
		System.out.println(k);
		System.out.println("Deleted ...");
		close();
	}

	@Override
	public void update(ItemDTO v) {
		System.out.println(v);
		System.out.println("Updated ...");
		
	}

	
}
