package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertTest2 {
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
		String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";
		PreparedStatement pstmt = null;
		Connection con = null;

		// Statement 생성 - SQL(해당 sql -> db 날리는 것)

		try {
			con = DriverManager.getConnection(url, id, pwd);
			pstmt = con.prepareStatement(insertSql);
			pstmt.setString(1, "id13");
			pstmt.setString(2, "pwd10");
			pstmt.setString(3, "홍길동");
			pstmt.setInt(4, 50);
			int result = pstmt.executeUpdate();
			System.out.println(result);

		} catch (SQLException e1) {

			e1.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}

			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("close가 실패하였습니다");
				e.printStackTrace();
				return;
			}
			System.out.println("close 성공!!");

		}
		// SQL 전송

		// Close

	}
}
