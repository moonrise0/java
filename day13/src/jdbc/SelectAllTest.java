package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAllTest {
	public static void main(String[] args) {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공!");

		// Connect
		String id = "bank";
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.21.69:1521:XE";
		String selectAllSql = "SELECT * FROM cust ";

		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(selectAllSql);) { // prepare 먼저만들고
//			pstmt.setString(1, "id01"); 물음표가 없으므로 지운다. 

			try (ResultSet rset = pstmt.executeQuery()) { // 전체의 값이 들어있다.
				while (rset.next()) {
					String db_id = rset.getString("id");
					String db_pwd = rset.getString("pwd");
					String name = rset.getString("name");
					int age = rset.getInt("age");
					System.out.println(db_id + " " + name + " " + age);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (SQLException e1) {

			e1.printStackTrace();
		}
	
	}
}
