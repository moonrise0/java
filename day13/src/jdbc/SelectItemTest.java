package jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class SelectItemTest {
	public static void main(String[] args) {
	CRUDService<String, Item> service = new ItemCRUDServiceImpl();
	 
	
	 try {
		Item item = service.get("1111");
		
		System.out.println(item.toString());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}
	}

