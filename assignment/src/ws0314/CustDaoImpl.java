package ws0314;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CustDaoImpl implements DAO<String, String, Cust> {

	public CustDaoImpl() { // driver loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		// System.out.println("Driver Loading 성공!");
	}

//	@Override
//	public void insert(Cust v) throws Exception {
//
//		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
//			pstmt.setString(1, v.getId());
//			pstmt.setString(2, v.getPwd());
//			pstmt.setString(3, v.getName());
//			pstmt.setInt(4, v.getAge());
//			int result = pstmt.executeUpdate();
//
//		} catch (SQLException e1) {
//			throw e1;
//
//		}
//
//	}

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
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.updateSql);) {
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getAge());
			pstmt.setString(4, v.getId()); //

			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("수정된게 없음");
			}

			System.out.println(result);

		} catch (SQLException e1) {

			// e1.printStackTrace();
		}

	}

	@Override
	public Cust select(String k) throws Exception {
		Cust cust = null;
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectSql);) {
			pstmt.setString(1, k); // 물음표가 있었기에 밑에 selectall에는 안되서 바로 가져옴.

			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next();
				String id = rset.getString("id");
				String pwd = rset.getString("pwd");
				String name = rset.getString("name");
				int age = rset.getInt("age");
				cust = new Cust(id, pwd, name, age);

			} catch (Exception e) {
				throw e;
				// e.printStackTrace();
			}

		} catch (Exception e) {
			throw e; // 서비스의 cust get으로 감!
//			e.printStackTrace(); //네트워크 문제일때
		}
		return cust;
	}

	@Override
	public List<Cust> selectAll() throws Exception {
		List<Cust> list = new ArrayList<>();
		try (Connection con = getConnection(); // 네트워크 문제
				PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql)) {
			try (ResultSet rset = pstmt.executeQuery();) {

				while (rset.next()) {
					Cust cust = null;
					String id = rset.getString("id");
					String pwd = rset.getString("pwd");
					String name = rset.getString("name");
					int age = rset.getInt("age");
					cust = new Cust(id, pwd, name, age);
					list.add(cust); // 만들어서 list에 넣고
				}

				// 데이터가 없을때까지 while로 꺼낸다.
			}

		} catch (Exception e) {
			throw e;

		}
		return list;
	}

	@Override
	public List<Cust> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;

	}

	@Override
	public void insert(Cust v) throws Exception {
		// TODO Auto-generated method stub

	}
}
