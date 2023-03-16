package jdbc;

import java.util.List;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CartSelectAllTest2 {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService =
				new CustCRUDServiceImpl();
		List<Cust> list = null;
		try {
			list = crudService.get();
			if(list.size()== 0) {
				System.out.println("데이터가 없습니다.");
				return;  //리턴의 의미는 더이상  for 문 하지 말라.
			}
			
			for(Cust obj: list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}






