package ws0314;

public class CartInsertTest {

    public static void main(String[] args) {
        CRUDService<String, Cart> service = new CartCRUDServiceImpl();
        Cart cart = new Cart("user03", "item04", 4);
        try {
            service.register(cart);
            System.out.println("성공!");
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }
    }
}
