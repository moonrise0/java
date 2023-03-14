package com.kbstar.test.cart;


import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;


public class CartSelectTest {
    public static void main(String[] args) {
        CRUDService<String, Cart> service = new CartCRUDServiceImpl();

        try {
            Cart item = service.get("2023314293100");
            System.out.println(item.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
