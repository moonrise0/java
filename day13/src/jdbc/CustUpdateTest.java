package jdbc;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustUpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          CRUDService <String, Cust> crudService =
           new CustCRUDServiceImpl();
          
          Cust cust = new Cust("id03", "3333", "tom", 40);
          try {
			crudService.modify(cust);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			}
	}

}
