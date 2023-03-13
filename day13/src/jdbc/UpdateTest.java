package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {
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
		String updateSql = "UPDATE cust SET pwd=?, name=?, age=? WHERE id=?";


		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(updateSql);) {
			pstmt.setString(1, "pwd02");
			pstmt.setString(2, "james");
			pstmt.setInt(3, 30);
			pstmt.setString(4, "id02"); //
	
			int result = pstmt.executeUpdate();
			System.out.println(result);

		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		// SQL 전송

		// Close

	}
}
