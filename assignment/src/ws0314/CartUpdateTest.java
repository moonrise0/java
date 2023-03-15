package ws0314;

public class CartUpdateTest {
    public static void main(String[] args) {
        CRUDService<String, Cart> service = new CartCRUDServiceImpl();
        
        Cart cart = new Cart("user2", "item3", 3);
        try {
            service.modify(cart);
            System.out.println("성공");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}