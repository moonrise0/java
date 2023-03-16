package jdbc;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.CustCRUDServiceImpl;

public class CartInsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          CRUDService <String, Cart> crudService =
           new CartCRUDServiceImpl();
          
          Cart cart = null;
          try {
			cart = crudService.get("id03");
			System.out.println(cart);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			}
	}

}




