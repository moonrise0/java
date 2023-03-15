package ws0314;

import java.util.List;

public class ShopServiceImpl implements ShopService<Cust, Cart> {

	DAO<String, String, Cust> custDao;
	DAO<String, String, Item> itemDao;
	DAO<String, String, Cart> cartDao;

	public ShopServiceImpl() { // 함수 선언 이후 사용
		custDao = new CustDaoImpl();
		itemDao = new ItemDaoImpl();
		cartDao = new CartDaoImpl();
	}

	@Override
    public Cust login(String id, String pwd) throws Exception {
        Cust cust = custDao.select(id);
        if (cust != null) {
            if (cust.getPwd().equals(pwd)) {
                System.out.println("OK");
            } else {
                throw new Exception("비밀번호가 틀려요!");
            }
        } else {
            throw new Exception("로그인 실패!");
        }
        return cust;
    }
		@Override
		public void register(Cust v) throws Exception {
			try {
				custDao.insert(v);
			} catch (Exception e) {
				throw new Exception("등록오류");

			}
//			notification.sendEmail(v.getEmail(), "축하합니다");
//			notification.sendSMS(v.getContact(), "축하합니다");

		}		
		
		@Override
		public List<Cart> myCart(String id) throws Exception {
		List<Cart> list = null;
		list = cartDao.search(id);
		return list;
		}
		
		

	
}



		



