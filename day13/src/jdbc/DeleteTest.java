package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {
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
		String url = "jdbc:oracle:thin:@172.16.21.61:1521:XE";
		String deleteSql = "DELETE FROM cust WHERE id = ? ";

		// Statement 생성 - SQL(해당 sql -> db 날리는 것)

		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(deleteSql);) {
			pstmt.setString(1, "id2"); //물음표 하나밖에 없으니깐
	
			int result = pstmt.executeUpdate();
			System.out.println(result); //리설트가 0이면 대상이없는데 

		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		// SQL 전송

		// Close

	}
}
