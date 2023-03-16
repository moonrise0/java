package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dao.ItemDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeCartNumber;

public class CartCRUDServiceImpl implements CRUDService<String, Cart> {

	DAO<String, String, Cart> dao;

	public CartCRUDServiceImpl() {
		dao = new CartDaoImpl();
	}

	@Override
	public void register(Cart v) throws Exception {
		try {

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
	public void modify(Cart v) throws Exception {
		// TODO Auto-generated method stub

		try {
			dao.update(v);
		} catch (Exception e) {

		}

	}

	@Override
	public void remove(String k) throws Exception {
		// TODO Auto-generated method stub

		try {
			dao.delete(k);
		} catch (Exception e) {

			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("id 장애");
			}
		}

	}

	@Override
	public Cart get(String k) throws Exception {
		Cart cart = null;
		try {
			cart = dao.select(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다.");
			} else {
				throw new Exception("ID가 존재 하지 않습니다");
			}
		}
		return cart;

	}

	@Override
	public List<Cart> get() throws Exception {
		List<Cart> list = null;

		try {
			list = dao.selectAll(); // 이거 안해주면 화면에 이상한 거 뜸.
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다.");
			} else {
				throw new Exception("ID가 존재 하지1 않습니다");
			}
		}
		return list;

	}



}
