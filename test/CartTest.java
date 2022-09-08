import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import products.Brand;

import products.Cart;
import products.Product;


import java.util.ArrayList;
import java.util.List;


public class CartTest {


    @Test
    void buyTest() {
        List<Product> productList = new ArrayList<>();
        Product product = new Product(productList, Brand.ACER, "TravelMate P2", "Black", 329.00, "This PC works", "pc", 4);
        productList.add(product);
        Cart cart = new Cart(productList);
        product.setQuantity(-1);
        Assertions.assertEquals(product.getQuantity(), cart.buy(product));
    }

    @Test
    void abortTest() {
        List<Product> productList = new ArrayList<>();
        Product product = new Product(productList, Brand.ACER, "TravelMate P2", "Black", 329.00, "This PC works", "pc", 4);
        productList.add(product);
        Cart cart = new Cart(productList);
        product.setQuantity(+1);
        Assertions.assertEquals(product.getQuantity(), cart.abort(product));
    }


    @Test
    void addedOnCartTest() {
        List<Product> productList = new ArrayList<>();
        Product computer = new Product(productList, Brand.ACER, "dsdkkdsksds", "jjjjd", 3.0, "idskdskdk", "computer", 10);
        Cart cart = new Cart(productList);
        Assertions.assertTrue(cart.addedOnCart(computer));

    }

    @Test
    void totalPriceTest() {
        List<Product> productList = new ArrayList<>();
        Cart cart = new Cart(productList);
        Product smartphone = new Product(productList, Brand.ACER, "SJDJDJJSD", "CKDSKSKKS", 3.0, "SKSKK", "smartphone", 10);
        Product tv = new Product(productList, Brand.LG, "SJDJDJJSD", "CKDSKSKKS", 3.0, "SKSKK", "TV", 34);
        productList.add(smartphone);
        productList.add(tv);
        Assertions.assertEquals(6.0, cart.totalPrice(smartphone, tv));
    }


}
