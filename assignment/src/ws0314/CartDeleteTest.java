package ws0314;

public class CartDeleteTest {
    public static void main(String[] args) {
        CRUDService<String, Cart> service = new CartCRUDServiceImpl();
        try {
            service.remove("2023314293100");
            System.out.println("성공");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
