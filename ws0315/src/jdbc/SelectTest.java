package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {
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
		String selectSql = "SELECT * FROM cust WHERE id = ?";

		// Statement 생성 - SQL(해당 sql -> db 날리는 것)

		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(selectSql);) { //prepare 먼저만들고
			pstmt.setString(1, "id01"); 
			
			try(ResultSet rset = pstmt.executeQuery()){ //여기에 값을 넣고,
				rset.next(); //옆에 있는 실제 위치 , 이전의 데이터 위치를 가리키고 있으므로
				String db_id = rset.getString("id");
				String db_pwd = rset.getString("pwd");
				String name = rset.getString("name");
				int age = rset.getInt("age");
				System.out.println(db_id+" "+name+" "+age);
			}catch(SQLException e) {
				e.printStackTrace();
			}
	
		

		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		// SQL 전송

		// Close

	}
}
