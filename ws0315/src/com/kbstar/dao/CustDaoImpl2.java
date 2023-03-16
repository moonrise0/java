package com.kbstar.dao;  ///의미가없는

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import com.kbstar.dto.Cust;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;


public class CustDaoImpl2 implements DAO<String, String, Cust> {

	public CustDaoImpl2() { // driver loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공!");
	}

	public Connection getConnection() throws Exception { 
		// 자체함수 만든 것. 커넥션을 만들어서 밑에 줄게 (desert insert이런데)
		java.sql.Connection con = null;

		Properties props = new Properties();
		String fileName = "db_info.txt";
		FileInputStream in = new FileInputStream(fileName);
		props.load(in);

		String id = props.getProperty("DB_ID");
		String pwd = props.getProperty("DB_PWD");
		String url = props.getProperty("DB_URL");
		con = DriverManager.getConnection(url, id, pwd);
		return con; 
		

	}
	@Override
	public void insert(Cust v) throws Exception {

		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setInt(4, v.getAge());
			int result = pstmt.executeUpdate();

		} catch (SQLException e1) {
			throw e1;
			
			
			
		}

	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql);) {
			pstmt.setString(1, k);

			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("지울 id 없음");
			}

			System.out.println(result);

		} catch (SQLException e1) {
			throw e1;
			// e1.printStackTrace();
		} 
	}


		
	

	@Override
	public void update(Cust v) throws Exception {
		try (Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement(Sql.updateSql);) {
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getAge());
			pstmt.setString(4, v.getId()); //
	
			int result = pstmt.executeUpdate();
			if(result ==0) { 
				throw new Exception("수정된게 없음");
			}
			
			System.out.println(result);

			
			
		
		} catch (SQLException e1) {

			// e1.printStackTrace();
		}
		

	}

	@Override
	public Cust select(String k) throws Exception  {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cust> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cust> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	

}	}
