package jdbc;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustSelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          CRUDService <String, Cust> crudService =
           new CustCRUDServiceImpl();
          
          Cust cust = null;
          try {
			crudService.get("id03");
			System.out.println(cust);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			}
	}

}




