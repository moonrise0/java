package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CartDaoImpl implements DAO<String, String, Cart> {

	public CartDaoImpl() { // driver loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공!");
	}

	@Override
	public void delete(String k) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Cart v) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Cart select(String k) throws Exception {
		Cart cart = null;
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartSelectSql);) {
			pstmt.setString(1, k);

			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next();

				String id = rset.getString("id");
				String UserId = rset.getString("UserId");
				String ItemId = rset.getString("ItemId");
				int cnt = rset.getInt("cnt");
				Date regdate = rset.getDate("regdate");
				cart = new Cart(id, UserId, ItemId, cnt, regdate);
//				list.add(item);}

			} catch (Exception e) {
				e.printStackTrace();
				throw e;

			}

		} catch (Exception e) {
			throw e; //
//			e.printStackTrace(); //네트워크 문제일때
		}
		return cart;
	}

	@Override
	public List<Cart> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cart> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Cart v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartInsertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getUserId());
			pstmt.setString(3, v.getItemId());
			pstmt.setInt(4, v.getCnt());
			pstmt.executeUpdate();

		} catch (Exception e) {
			throw e;
		}

	}
}
