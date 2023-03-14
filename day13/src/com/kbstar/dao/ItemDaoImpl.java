package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class ItemDaoImpl implements DAO<String, String, Item> { // 인터페이스 껍데기

	public ItemDaoImpl() { // driver loading
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
	public void update(Item v) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Item select(String k) throws Exception {
		Item item = null;
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.itemSelectSql);) {
			pstmt.setString(1, k);

			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next();

				String id = rset.getString("id");
				String name = rset.getString("name");
				int price = rset.getInt("price");
				double rate = rset.getDouble("rate");
				Date regdate = rset.getDate("regdate");
				item = new Item(id, name, price, rate, regdate);
//				list.add(item);}

			} catch (Exception e) {
				 e.printStackTrace();
				throw e;
				
			}

		} catch (Exception e) {
			throw e; //
//			e.printStackTrace(); //네트워크 문제일때
		}
		return item;
	}

	@Override
	public List<Item> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Item v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.itemdInsertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getPrice());
			pstmt.setDouble(4, v.getRate());
			pstmt.executeUpdate();

		} catch (Exception e) {
			throw e;
		}

	}
}

//
//}
//	@Override
//	public void getConnection() throws Exception {
//		// TODO Auto-generated method stub
////		
////	}
//
//
