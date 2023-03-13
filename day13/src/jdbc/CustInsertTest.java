package jdbc;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustInsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          CRUDService <String, Cust> crudService =
           new CustCRUDServiceImpl();
          
          Cust cust = new Cust("id20", "pwd20", "tom",30);
          try {
			crudService.register(cust);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			}
	}

}
