package jdbc;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CustInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> crudService =
				new CartCRUDServiceImpl();

		
		
		
		Cart cart = new Cart("agds","Sdagsdg","sadgsd", "25", 1241-22-15);
				
		try {
			crudService.register(cart);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}






