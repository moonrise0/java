package ws0314;

import java.util.List;

public class MyCartSelectAllTest {

	public static void main(String[] args) {
		ShopService<Cust,Cart> service =
				new ShopServiceImpl();
		List<Cart> list = null;
		
		try {
			list = Service.myCart("id01");
			
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






